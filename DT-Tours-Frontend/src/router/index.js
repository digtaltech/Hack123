import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import PlanningPage from '../views/PlanningPage.vue'
import CustomizationPage from '../views/CustomizationPage.vue'
import ConfirmationPage from '../views/ConfirmationPage.vue'
import Account from '../views/account.vue'
import AllTours from '../views/AllTours.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  },
  {
    path: '/planningpage',
    name: 'PlanningPage',
    component: PlanningPage
  },
  {
    path: '/customizationpage',
    name: 'CustomizationPage',
    component: CustomizationPage
  },
  {
    path: '/confirmationpage',
    name: 'ConfirmationPage',
    component: ConfirmationPage
  },
  {
    path: '/account',
    name: 'account',
    component: Account
  },
  {
    path: '/alltours',
    name: 'AllTours',
    component: AllTours
  },
]

const router = new VueRouter({
  routes
})

export default router
