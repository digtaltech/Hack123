<template>
  <div class="myTours" v-if="CART_LIST.length">
    <div v-for="tour in CART_LIST" :key="tour.day">
      <div class="card" style="border-radius: 15px; margin-bottom: 1rem">
        <div class="row">
          <div class="col">
            <h4 class="mx-4 my-4" style="color:#3B516C">{{tour.name}}</h4>
            <h6 class="mx-4 my-4" style="color:#3B516C">{{tour.street}}</h6>
          </div>
          <div class="col" style="text-align: right">
            <button type="button" class="btn btn-link">Подробнее</button>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import {mapGetters} from 'vuex'

export default {
  name: 'Home',
  components: {
  },
  computed: {
    ...mapGetters([
      'CART_LIST',
    ]),
  },
}
</script>

<style>
.myTours{
  margin-left: 30rem;
  margin-right: 30rem;
}
</style>
