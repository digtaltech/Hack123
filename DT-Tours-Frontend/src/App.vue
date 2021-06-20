<template>
  <div id="app">
    <!-- <div id="nav">
      <router-link to="/">Home</router-link>
      <router-link to="/about">About</router-link>
      <router-link to="/PlanningPage">PlanningPage</router-link>
      <router-link to="/CustomizationPage">CustomizationPage</router-link>
      <router-link to="/ConfirmationPage">ConfirmationPage</router-link>
      <router-link to="/account">account</router-link>
      <router-link to="/AllTours">AllTours</router-link>
    </div> -->
    <div style="">
          <div class="inBlock">
            <div class="inBlockLogo">
              <img src="./assets/Logo.svg" style="margin-left: 3rem; margin-bottom: 3rem; margin-top: 2rem" alt="DT TOUR">
            </div>
            <div>
              <router-link to="/PlanningPage"><button type="button" class="btn btn-link" style="text-decoration: none; color:#283E59; margin-left: 3rem"><h3>Мои туры</h3></button></router-link>
            </div>
            <div>
              <button type="button" class="btn btn-link" style="text-decoration: none; color:#283E59"><h3>Готовые туры</h3></button>
            </div>
            <div>
              <router-link to="/account"><button type="button" class="btn btn-link" style="text-decoration: none; color:#283E59"><h3>Аккаунт</h3></button></router-link>
            </div>
        </div>
    </div>
    <router-view/>
  </div>
</template>

<style>
#app {
  width: 100%;
  height: 100%;
  background: linear-gradient(to right, #F9F9F9 65%, #2C7BE5 35%);
}
html, body {
  height: 100%;
  margin: 0;
  padding: 0;
  overflow: hidden;
}
.inBlock div{
  display:inline-block;
}
</style>
