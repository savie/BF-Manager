package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۫۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 41JE */
/* JADX INFO: loaded from: classes4.dex */
public final class C12253 extends C20719 {

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public boolean f41000;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public float f41001 = -1.0f;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public int f40997 = -1;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public int f40998 = -1;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public C8725 f40996 = this.f67392;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public int f40999 = 0;

    @Override // l.C20719
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo30462() {
        return true;
    }

    public C12253() {
        this.f67373.clear();
        this.f67373.add(this.f40996);
        int length = this.f67398.length;
        for (int i = 0; i < length; i++) {
            this.f67398[i] = this.f40996;
        }
    }

    @Override // l.C20719
    /* JADX INFO: renamed from: ۙ */
    public final void mo1745(C20719 c20719, HashMap map) {
        super.mo1745(c20719, map);
        C12253 c12253 = (C12253) c20719;
        this.f41001 = c12253.f41001;
        this.f40997 = c12253.f40997;
        this.f40998 = c12253.f40998;
        m30470(c12253.f40999);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m30470(int i) {
        if (this.f40999 == i) {
            return;
        }
        this.f40999 = i;
        ArrayList arrayList = this.f67373;
        arrayList.clear();
        if (this.f40999 == 1) {
            this.f40996 = this.f67385;
        } else {
            this.f40996 = this.f67392;
        }
        arrayList.add(this.f40996);
        C8725[] c8725Arr = this.f67398;
        int length = c8725Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c8725Arr[i2] = this.f40996;
        }
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final C8725 m30472() {
        return this.f40996;
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final int m30459() {
        return this.f40999;
    }

    @Override // l.C20719
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8725 mo30461(EnumC19308 enumC19308) {
        switch (C16486.f52973[enumC19308.ordinal()]) {
            case 1:
            case 2:
                if (this.f40999 == 1) {
                    return this.f40996;
                }
                break;
            case 3:
            case 4:
                if (this.f40999 == 0) {
                    return this.f40996;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(enumC19308.name());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m30466(float f) {
        if (f > -1.0f) {
            this.f41001 = f;
            this.f40997 = -1;
            this.f40998 = -1;
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m30464(int i) {
        if (i > -1) {
            this.f41001 = -1.0f;
            this.f40997 = i;
            this.f40998 = -1;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30471(int i) {
        if (i > -1) {
            this.f41001 = -1.0f;
            this.f40997 = -1;
            this.f40998 = i;
        }
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final float m30463() {
        return this.f41001;
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final int m30467() {
        return this.f40997;
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final int m30460() {
        return this.f40998;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m30465(int i) {
        this.f40996.m22570(i);
        this.f41000 = true;
    }

    @Override // l.C20719
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean mo30473() {
        return this.f41000;
    }

    @Override // l.C20719
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo30469() {
        return this.f41000;
    }

    @Override // l.C20719
    /* JADX INFO: renamed from: ۙ */
    public final void mo1744(C5196 c5196, boolean z) {
        C15781 c15781 = (C15781) this.f67433;
        if (c15781 == null) {
            return;
        }
        C8725 c8725Mo30461 = c15781.mo30461(EnumC19308.LEFT);
        C8725 c8725Mo30462 = c15781.mo30461(EnumC19308.RIGHT);
        C20719 c20719 = this.f67433;
        boolean z2 = c20719 != null && c20719.f67434[0] == EnumC7313.WRAP_CONTENT;
        if (this.f40999 == 0) {
            c8725Mo30461 = c15781.mo30461(EnumC19308.TOP);
            c8725Mo30462 = c15781.mo30461(EnumC19308.BOTTOM);
            C20719 c207110 = this.f67433;
            z2 = c207110 != null && c207110.f67434[1] == EnumC7313.WRAP_CONTENT;
        }
        if (this.f41000 && this.f40996.m22578()) {
            C15075 c15075M14364 = c5196.m14364(this.f40996);
            c5196.m14367(c15075M14364, this.f40996.m22579());
            if (this.f40997 != -1) {
                if (z2) {
                    c5196.m14374(c5196.m14364(c8725Mo30462), c15075M14364, 0, 5);
                }
            } else if (this.f40998 != -1 && z2) {
                C15075 c15075M14365 = c5196.m14364(c8725Mo30462);
                c5196.m14374(c15075M14364, c5196.m14364(c8725Mo30461), 0, 5);
                c5196.m14374(c15075M14365, c15075M14364, 0, 5);
            }
            this.f41000 = false;
            return;
        }
        if (this.f40997 != -1) {
            C15075 c15075M14366 = c5196.m14364(this.f40996);
            c5196.m14369(c15075M14366, c5196.m14364(c8725Mo30461), this.f40997, 8);
            if (z2) {
                c5196.m14374(c5196.m14364(c8725Mo30462), c15075M14366, 0, 5);
                return;
            }
            return;
        }
        if (this.f40998 != -1) {
            C15075 c15075M14367 = c5196.m14364(this.f40996);
            C15075 c15075M14368 = c5196.m14364(c8725Mo30462);
            c5196.m14369(c15075M14367, c15075M14368, -this.f40998, 8);
            if (z2) {
                c5196.m14374(c15075M14367, c5196.m14364(c8725Mo30461), 0, 5);
                c5196.m14374(c15075M14368, c15075M14367, 0, 5);
                return;
            }
            return;
        }
        if (this.f41001 != -1.0f) {
            C15075 c15075M14369 = c5196.m14364(this.f40996);
            C15075 c15075M143610 = c5196.m14364(c8725Mo30462);
            float f = this.f41001;
            C13664 c13664M14362 = c5196.m14362();
            c13664M14362.f45055.mo9559(c15075M14369, -1.0f);
            c13664M14362.f45055.mo9559(c15075M143610, f);
            c5196.m14366(c13664M14362);
        }
    }

    @Override // l.C20719
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo30468(C5196 c5196, boolean z) {
        if (this.f67433 == null) {
            return;
        }
        C8725 c8725 = this.f40996;
        c5196.getClass();
        int iM14358 = C5196.m14358(c8725);
        if (this.f40999 == 1) {
            this.f67372 = iM14358;
            this.f67415 = 0;
            m46620(this.f67433.m46619());
            m46608(0);
            return;
        }
        this.f67372 = 0;
        this.f67415 = iM14358;
        m46608(this.f67433.m46640());
        m46620(0);
    }
}
