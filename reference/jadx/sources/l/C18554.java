package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: LBAF */
/* JADX INFO: loaded from: classes5.dex */
public final class C18554 extends AbstractC10586 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f59028;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f59029;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC9901 f59030;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C20671 f59031;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f59032;

    public C18554(C11312 c11312, C20671 c20671, ArrayList arrayList, AbstractC9901 abstractC9901) {
        super(c11312, C0727.f3015);
        if (c20671 == null) {
            throw new NullPointerException("user == null");
        }
        if (arrayList == null) {
            throw new NullPointerException("values == null");
        }
        if (arrayList.size() <= 0) {
            throw new IllegalArgumentException("Illegal number of init values");
        }
        this.f59030 = abstractC9901;
        if (abstractC9901 == C6143.f20977 || abstractC9901 == C6143.f20976) {
            this.f59032 = 1;
        } else if (abstractC9901 == C6143.f20960 || abstractC9901 == C6143.f20970) {
            this.f59032 = 2;
        } else if (abstractC9901 == C6143.f20965 || abstractC9901 == C6143.f20969) {
            this.f59032 = 4;
        } else if (abstractC9901 == C6143.f20971 || abstractC9901 == C6143.f20975) {
            this.f59032 = 8;
        } else {
            throw new IllegalArgumentException("Unexpected constant type");
        }
        this.f59031 = c20671;
        this.f59029 = arrayList;
        this.f59028 = arrayList.size();
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ܰ */
    public final int mo15536() {
        return (((this.f59028 * this.f59032) + 1) / 2) + 4;
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final void mo15535(C2718 c2718) {
        ArrayList arrayList = this.f59029;
        int size = arrayList.size();
        c2718.m8297(768);
        int i = this.f59032;
        c2718.m8297(i);
        c2718.m8289(this.f59028);
        if (i == 1) {
            for (int i2 = 0; i2 < size; i2++) {
                c2718.m8280((byte) ((AbstractC19549) ((AbstractC9901) arrayList.get(i2))).mo21658());
            }
        } else if (i == 2) {
            for (int i3 = 0; i3 < size; i3++) {
                c2718.m8297((short) ((AbstractC19549) ((AbstractC9901) arrayList.get(i3))).mo21658());
            }
        } else if (i == 4) {
            for (int i4 = 0; i4 < size; i4++) {
                c2718.m8289(((AbstractC19549) ((AbstractC9901) arrayList.get(i4))).mo21658());
            }
        } else if (i == 8) {
            for (int i5 = 0; i5 < size; i5++) {
                c2718.m8284(((AbstractC8966) ((AbstractC9901) arrayList.get(i5))).mo21659());
            }
        }
        if (i != 1 || size % 2 == 0) {
            return;
        }
        c2718.m8280(0);
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16438 mo8569(C0727 c0727) {
        return new C18554(m38701(), this.f59031, this.f59029, this.f59030);
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final String mo8568() {
        StringBuilder sb = new StringBuilder(100);
        ArrayList arrayList = this.f59029;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append("\n    ");
            sb.append(i);
            sb.append(": ");
            sb.append(((AbstractC9901) arrayList.get(i)).mo2376());
        }
        return sb.toString();
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ܶ */
    public final String mo15537() {
        int iM38698 = this.f59031.m38698();
        StringBuilder sb = new StringBuilder(100);
        ArrayList arrayList = this.f59029;
        int size = arrayList.size();
        sb.append("fill-array-data-payload // for fill-array-data @ ");
        sb.append(C22475.m49982(iM38698));
        for (int i = 0; i < size; i++) {
            sb.append("\n  ");
            sb.append(i);
            sb.append(": ");
            sb.append(((AbstractC9901) arrayList.get(i)).mo2376());
        }
        return sb.toString();
    }
}
