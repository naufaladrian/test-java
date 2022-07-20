class BioData {
    String nama;
    String asal;

    public BioData() {
    }

    public BioData(String nama, String asal) {
        this.nama = nama;
        this.asal = asal;
    }

    public String toString() {
        return "BioData{" +
                "nama='" + nama + '\'' +
                ", asal='" + asal + '\'' +
                '}';
    }
}
