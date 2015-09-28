package domain;

/**
 * Created by gabriel on 28/09/15.
 */
public class Patient {
    private FDP fdp;
    private GDX gdx;
    private HRT hrt;
    private IOP iop;
    private OCT oct;
    private SWAP swap;
    private VA va;

    public Patient(FDP fdp, GDX gdx, HRT hrt, IOP iop, OCT oct, SWAP swap, VA va) {
        this.fdp = fdp;
        this.gdx = gdx;
        this.hrt = hrt;
        this.iop = iop;
        this.oct = oct;
        this.swap = swap;
        this.va = va;
    }

    public FDP getFdp() {
        return fdp;
    }

    public void setFdp(FDP fdp) {
        this.fdp = fdp;
    }

    public GDX getGdx() {
        return gdx;
    }

    public void setGdx(GDX gdx) {
        this.gdx = gdx;
    }

    public HRT getHrt() {
        return hrt;
    }

    public void setHrt(HRT hrt) {
        this.hrt = hrt;
    }

    public IOP getIop() {
        return iop;
    }

    public void setIop(IOP iop) {
        this.iop = iop;
    }

    public OCT getOct() {
        return oct;
    }

    public void setOct(OCT oct) {
        this.oct = oct;
    }

    public SWAP getSwap() {
        return swap;
    }

    public void setSwap(SWAP swap) {
        this.swap = swap;
    }

    public VA getVa() {
        return va;
    }

    public void setVa(VA va) {
        this.va = va;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "fdp=" + fdp +
                ", gdx=" + gdx +
                ", hrt=" + hrt +
                ", iop=" + iop +
                ", oct=" + oct +
                ", swap=" + swap +
                ", va=" + va +
                '}';
    }

    public static class Builder {
        private FDP fdp;
        private GDX gdx;
        private HRT hrt;
        private IOP iop;
        private OCT oct;
        private SWAP swap;
        private VA va;

        public Builder fdp(FDP fdp) {
            this.fdp = fdp;
            return this;
        }

        public Builder gdx(GDX gdx) {
            this.gdx = gdx;
            return this;
        }

        public Builder hrt(HRT hrt) {
            this.hrt = hrt;
            return this;
        }

        public Builder iop(IOP iop) {
            this.iop = iop;
            return this;
        }

        public Builder oct(OCT oct) {
            this.oct = oct;
            return this;
        }

        public Builder swap(SWAP swap) {
            this.swap = swap;
            return this;
        }

        public Builder va(VA va) {
            this.va = va;
            return this;
        }

        public Patient build() {
            return new Patient(fdp, gdx, hrt, iop, oct, swap, va);
        }
    }
}
