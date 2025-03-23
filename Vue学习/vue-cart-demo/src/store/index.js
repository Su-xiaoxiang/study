import Vue from 'vue'
import Vuex from 'vuex'
import cart from './modules/cart'
import article from './modules/article'
import user from './modules/user'
Vue.use(Vuex)

const store = new Vuex.Store({
  modules: {
    cart,
    article,
    user
  }
})

export default store
