package l;

/* JADX INFO: renamed from: l.᩻֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 565E */
/* JADX INFO: loaded from: classes.dex */
public class C23352 extends AbstractC11833 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f75656 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC11833[] f75657;

    public C23352(C12063 c12063, C13825 c13825) {
        int i = 0;
        this.f75657 = new AbstractC11833[c13825.m33647()];
        while (true) {
            AbstractC11833[] abstractC11833Arr = this.f75657;
            if (i >= abstractC11833Arr.length) {
                return;
            }
            abstractC11833Arr[i] = AbstractC11833.m29516(c12063, c13825);
            i++;
        }
    }

    public C23352(AbstractC11833[] abstractC11833Arr) {
        this.f75657 = abstractC11833Arr;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ */
    public void mo4463(C4651 c4651) {
        c4651.m12842(this.f75657.length);
        for (AbstractC11833 abstractC11833 : this.f75657) {
            abstractC11833.mo4463(c4651);
        }
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ */
    public int mo4462(int i) {
        int iM33072 = C13530.m33072(this.f75657.length) + i;
        for (AbstractC11833 abstractC11833 : this.f75657) {
            iM33072 = abstractC11833.mo4462(iM33072);
        }
        return iM33072;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ܰ */
    public final int mo4464(AbstractC11833 abstractC11833) {
        C23352 c23352 = (C23352) abstractC11833;
        int length = this.f75657.length - c23352.f75657.length;
        if (length != 0) {
            return length;
        }
        int i = 0;
        while (true) {
            AbstractC11833[] abstractC11833Arr = this.f75657;
            if (i >= abstractC11833Arr.length) {
                return length;
            }
            length = abstractC11833Arr[i].compareTo(c23352.f75657[i]);
            if (length != 0) {
                return length;
            }
            i++;
        }
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ᩸ */
    public final EnumC18182 mo4465() {
        return EnumC18182.VALUE_ARRAY;
    }

    public final int hashCode() {
        if (this.f75656 == 0) {
            this.f75656 = 0;
            for (AbstractC11833 abstractC11833 : this.f75657) {
                this.f75656 = abstractC11833.hashCode() + (this.f75656 * 31);
            }
        }
        return this.f75656;
    }
}
