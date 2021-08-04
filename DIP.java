interface Eletronico {
	void liga(boolean b);
	void desliga(boolean b);
	void aumentavolume(int v);
	void diminuivolume(int v);
}

class Televisao implements Eletronico {
    @Override
    public void liga(boolean b) {
        b = true;
    }
    
    @Override
    public void desliga(boolean b) {
        b = false;
    }

    @Override
    public void aumentavolume(int v) {
        this.aumentavolume(v);
    }

    @Override
    public void diminuivolume(int v) {
        System.out.println("Diminuiu");
    }
}

class Radio implements Eletronico {
    @Override
    public void liga(boolean b) {
        b = true;
    }
    
    @Override
    public void desliga(boolean b) {
        b = false;
    }

    @Override
    public void aumentavolume(int v) {
        this.aumentavolume(v);
    }

    @Override
    public void diminuivolume(int v) {
        System.out.println("Diminuiu");
    }
}

class Utilizar {
    int volumetotal;
    Eletronico radio1;
    Utilizar(Eletronico radio1) {this.radio1 = radio1;}
    void aumentavolume(int v) {
        v = 26;
        this.volumetotal += v;
    }

    public int getVolumetotal() {
        return volumetotal;
    }

    public void setVolumetotal(int volumetotal) {
        this.volumetotal = volumetotal;
    }
}