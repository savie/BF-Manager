package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U1KY */
/* JADX INFO: loaded from: classes4.dex */
public final class C9176 implements InterfaceC19759 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f31219;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f31220;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f31221;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f31222;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public List f31223;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f31224;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f31225;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f31226;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f31227;

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ۙ */
    public final int mo22127(boolean z) {
        return z ? mo22124() : mo22129();
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ۨ */
    public final int mo22131(boolean z) {
        return z ? mo22126() : mo22123();
    }

    public C9176(InterfaceC19759 interfaceC19759, List list) {
        this(interfaceC19759.mo23602(), interfaceC19759.mo23600(), interfaceC19759.mo23598(), interfaceC19759.mo23594(), interfaceC19759.mo22124(), interfaceC19759.mo22126(), interfaceC19759.mo22129(), interfaceC19759.mo22123(), list);
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ܰ */
    public final void mo22134(int i, boolean z) {
        if (z) {
            mo22130(i);
        } else {
            mo22135(i);
        }
    }

    @Override // l.InterfaceC19759
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo23603(boolean z) {
        return z ? mo23602() : mo23598();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    public C9176(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List list) {
        this.f31227 = i;
        this.f31222 = i2;
        this.f31219 = i3;
        this.f31226 = i4;
        this.f31225 = i5;
        this.f31224 = i6;
        this.f31221 = i7;
        this.f31220 = i8;
        int i9 = i6 - i5;
        int i10 = i8 - i7;
        if (list != null) {
            int size = list.size();
            if (size == 0) {
                list = null;
            } else if (size == 1) {
                InterfaceC19053 interfaceC19053 = (InterfaceC19053) list.get(0);
                if (interfaceC19053.mo22124() == 0 && interfaceC19053.mo22129() == 0 && interfaceC19053.mo22126() == i9 && interfaceC19053.mo22123() == i10) {
                    list = null;
                }
            }
        }
        this.f31223 = list;
        if (this.f31227 == this.f31222 && this.f31219 == this.f31226) {
            System.err.println("LineFragmentImpl should not be empty: " + toString());
        }
        if (this.f31227 > this.f31222 || this.f31219 > this.f31226 || this.f31225 > this.f31224 || this.f31221 > this.f31220) {
            System.err.println("LineFragmentImpl is invalid: " + toString());
        }
    }

    @Override // l.InterfaceC19759
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo23592(boolean z) {
        return z ? mo23600() : mo23594();
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ۖ */
    public final void mo22125(int i, boolean z) {
        if (z) {
            mo22132(i);
        } else {
            mo22133(i);
        }
    }

    @Override // l.InterfaceC19759
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23596(int i, boolean z) {
        if (z) {
            mo23601(i);
        } else {
            mo23591(i);
        }
    }

    public C9176(C17367 c17367) {
        this.f31227 = c17367.readInt();
        this.f31222 = c17367.readInt();
        this.f31219 = c17367.readInt();
        this.f31226 = c17367.readInt();
        this.f31225 = c17367.readInt();
        this.f31224 = c17367.readInt();
        this.f31221 = c17367.readInt();
        this.f31220 = c17367.readInt();
        if (c17367.m40461()) {
            int i = c17367.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C8470(c17367));
            }
            this.f31223 = arrayList;
        }
    }

    @Override // l.InterfaceC19759
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo23602() {
        return this.f31227;
    }

    @Override // l.InterfaceC19759
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int mo23600() {
        return this.f31222;
    }

    @Override // l.InterfaceC19759
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo23598() {
        return this.f31219;
    }

    @Override // l.InterfaceC19759
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int mo23594() {
        return this.f31226;
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ۖ */
    public final int mo22124() {
        return this.f31225;
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ۙ */
    public final int mo22126() {
        return this.f31224;
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ۚ */
    public final int mo22129() {
        return this.f31221;
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ֨ */
    public final int mo22123() {
        return this.f31220;
    }

    @Override // l.InterfaceC19759
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo23593(int i) {
        this.f31227 = i;
    }

    @Override // l.InterfaceC19759
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo23599(int i, boolean z) {
        if (z) {
            this.f31227 = i;
        } else {
            this.f31219 = i;
        }
    }

    @Override // l.InterfaceC19759
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void mo23601(int i) {
        this.f31222 = i;
    }

    @Override // l.InterfaceC19759
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23595(int i) {
        this.f31219 = i;
    }

    @Override // l.InterfaceC19759
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void mo23591(int i) {
        this.f31226 = i;
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ۚ */
    public final void mo22130(int i) {
        this.f31225 = i;
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ۨ */
    public final void mo22132(int i) {
        this.f31224 = i;
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ᩹ */
    public final void mo22135(int i) {
        this.f31221 = i;
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ܰ */
    public final void mo22133(int i) {
        this.f31220 = i;
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ۙ */
    public final void mo22128(C11018 c11018) {
        c11018.writeInt(this.f31227);
        c11018.writeInt(this.f31222);
        c11018.writeInt(this.f31219);
        c11018.writeInt(this.f31226);
        c11018.writeInt(this.f31225);
        c11018.writeInt(this.f31224);
        c11018.writeInt(this.f31221);
        c11018.writeInt(this.f31220);
        if (this.f31223 == null) {
            c11018.writeByte(0);
            return;
        }
        c11018.m27784(true);
        c11018.writeInt(this.f31223.size());
        Iterator it = this.f31223.iterator();
        while (it.hasNext()) {
            ((InterfaceC19053) it.next()).mo22128(c11018);
        }
    }

    @Override // l.InterfaceC19759
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List mo23604() {
        return this.f31223;
    }

    @Override // l.InterfaceC19759
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23597(List list) {
        this.f31223 = list;
    }

    public final String toString() {
        return "LineFragmentImpl: Lines [" + this.f31227 + ", " + this.f31222 + ") - [" + this.f31219 + ", " + this.f31226 + "); Offsets [" + this.f31225 + ", " + this.f31224 + ") - [" + this.f31221 + ", " + this.f31220 + "); Inner " + this.f31223;
    }
}
