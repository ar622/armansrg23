package com.Belajar;
// Interface BangunDatar
interface BangunDatar {
    double hitungLuas();
}

class Segitiga implements BangunDatar {
    double alas, tinggi;

    Segitiga(double a, double t) {
        alas = a;
        tinggi = t;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}

class PersegiPanjang implements BangunDatar {
    double panjang, lebar;

    PersegiPanjang(double p, double l) {
        panjang = p;
        lebar = l;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }
}

class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar;

        bangunDatar = new Segitiga(10, 20);
        System.out.println("Luas segitiga: " + bangunDatar.hitungLuas());

        bangunDatar = new PersegiPanjang(5, 7);
        System.out.println("Luas persegi panjang: " + bangunDatar.hitungLuas());
    }
}