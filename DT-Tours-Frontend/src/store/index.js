import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    toursRec: [
     {
       image:"https://anapacity.com/images/articles/big/gora-fisht.jpg",
       name:'Поездка на фишт',
       time:'12:55',
       spec:'Рекомендуем',
       street: 'Леселидзе 125а',
       day:'1',
     },
     {
       image:"https://prokat.pw/wp-content/uploads/2018/11/45758543.jpg",
       name:'Имеретинский курорт',
       time:'15:45',
       spec:'Подойдёт именно вам',
       street: 'Войкова 1',
       day:'2',
     },
   ],
   toursView: [
    {
      image:"https://img.tourister.ru/files/2/0/9/6/6/3/2/2/clones/870_489_fixedwidth.jpg?t=1624141264287",
      name:'Волконский дольмен',
      time:'12:55',
      spec:'Рекомендуем',
      day:'1',
    },
  ],
  cartList: [],
  },
  mutations: {
    SET_CART: (state, tour) => {
      state.cartList.push(tour)
    }
  },
  actions: {
    ADD_TO_CART({commit}, tour) {
      commit('SET_CART', tour);
    }
  },
  getters: {
    TOURS_REC(state){
      return state.toursRec;
    },
    TOURS_VIEW(state){
      return state.toursView;
    },
    CART_LIST(state){
      return state.cartList;
    }
  }
})
