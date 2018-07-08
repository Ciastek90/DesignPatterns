package com.patterns.operational.decorator;

public class AverageCar implements Car{

    public void Drive() {
        System.out.println("Jedziesz swoim ulubionym samochodem");
    }

    public void Destroy() {
        System.out.println("Płaczesz patrząc jak niszczony jest twoj samochód");
    }

    public void Enter() {
        System.out.println("Wsiadasz i włączasz stoją ububioną piosenkę TOTO Africa");
    }
}
