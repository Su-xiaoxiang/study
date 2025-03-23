import axios from 'axios'
const state = {
  list: []
}
const mutations = {
  updateList (state, newList) {
    state.list = newList
  },
  updateCount (state, obj) {
    const goods = state.list.find(item => item.id === obj.id)
    goods.count = obj.newCount
  }
}
const actions = {
  async getList (contest) {
    const res = await axios.get('http://localhost:3000/cart')
    contest.commit('updateList', res.data)
  },
  async updateCountAsync (context, obj) {
    await axios.patch(`http://localhost:3000/cart/${obj.id}`, {
      count: obj.newCount
    })
    context.commit('updateCount', {
      id: obj.id,
      newCount: obj.newCount
    })
  }
}
const getters = {
  total (state) {
    return state.list.reduce((sum, item) => sum + item.count, 0)
  },
  totalPrice () {
    return state.list.reduce((sum, item) => sum + item.count * item.price, 0)
  }
}
export default {
  namespaced: true,
  state,
  mutations,
  actions,
  getters
}
