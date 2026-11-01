package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 91K6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8725 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C15075 f29975;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f29976;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC19308 f29977;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f29978 = null;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f29979 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f29980 = -1;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C8725 f29981;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f29982;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C20719 f29983;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22571(int i, C19702 c19702, ArrayList arrayList) {
        HashSet hashSet = this.f29978;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C13352.m32849(((C8725) it.next()).f29983, i, arrayList, c19702);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet m22569() {
        return this.f29978;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m22566() {
        HashSet hashSet = this.f29978;
        return hashSet != null && hashSet.size() > 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m22581() {
        HashSet hashSet = this.f29978;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C8725) it.next()).m22567().m22568()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22570(int i) {
        this.f29982 = i;
        this.f29976 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m22579() {
        if (this.f29976) {
            return this.f29982;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m22582() {
        this.f29976 = false;
        this.f29982 = 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m22578() {
        return this.f29976;
    }

    public C8725(C20719 c20719, EnumC19308 enumC19308) {
        this.f29983 = c20719;
        this.f29977 = enumC19308;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C15075 m22575() {
        return this.f29975;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m22580() {
        C15075 c15075 = this.f29975;
        if (c15075 == null) {
            this.f29975 = new C15075(EnumC22836.UNRESTRICTED);
        } else {
            c15075.m36151();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m22577() {
        C8725 c8725;
        if (this.f29983.m46606() == 8) {
            return 0;
        }
        if (this.f29980 > -1 && (c8725 = this.f29981) != null && c8725.f29983.m46606() == 8) {
            return this.f29980;
        }
        return this.f29979;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m22576() {
        HashSet hashSet;
        C8725 c8725 = this.f29981;
        if (c8725 != null && (hashSet = c8725.f29978) != null) {
            hashSet.remove(this);
            if (this.f29981.f29978.size() == 0) {
                this.f29981.f29978 = null;
            }
        }
        this.f29978 = null;
        this.f29981 = null;
        this.f29979 = 0;
        this.f29980 = -1;
        this.f29976 = false;
        this.f29982 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22574(C8725 c8725, int i, int i2, boolean z) {
        if (c8725 == null) {
            m22576();
            return true;
        }
        if (!z && !m22573(c8725)) {
            return false;
        }
        this.f29981 = c8725;
        if (c8725.f29978 == null) {
            c8725.f29978 = new HashSet();
        }
        HashSet hashSet = this.f29981.f29978;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i > 0) {
            this.f29979 = i;
        } else {
            this.f29979 = 0;
        }
        this.f29980 = i2;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22572(C8725 c8725, int i) {
        m22574(c8725, i, -1, false);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m22568() {
        return this.f29981 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22573(C8725 c8725) {
        if (c8725 == null) {
            return false;
        }
        C20719 c20719 = c8725.f29983;
        EnumC19308 enumC19308 = c8725.f29977;
        EnumC19308 enumC19309 = this.f29977;
        if (enumC19308 == enumC19309) {
            return enumC19309 != EnumC19308.BASELINE || (c20719.m46574() && this.f29983.m46574());
        }
        switch (C8019.f26276[enumC19309.ordinal()]) {
            case 1:
                return (enumC19308 == EnumC19308.BASELINE || enumC19308 == EnumC19308.CENTER_X || enumC19308 == EnumC19308.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = enumC19308 == EnumC19308.LEFT || enumC19308 == EnumC19308.RIGHT;
                if (c20719 instanceof C12253) {
                    return z || enumC19308 == EnumC19308.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = enumC19308 == EnumC19308.TOP || enumC19308 == EnumC19308.BOTTOM;
                if (c20719 instanceof C12253) {
                    return z2 || enumC19308 == EnumC19308.CENTER_Y;
                }
                return z2;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(enumC19309.name());
        }
    }

    public final String toString() {
        return this.f29983.m46643() + ":" + this.f29977.toString();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C8725 m22567() {
        int[] iArr = C8019.f26276;
        EnumC19308 enumC19308 = this.f29977;
        int i = iArr[enumC19308.ordinal()];
        C20719 c20719 = this.f29983;
        switch (i) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return c20719.f67421;
            case 3:
                return c20719.f67385;
            case 4:
                return c20719.f67387;
            case 5:
                return c20719.f67392;
            default:
                throw new AssertionError(enumC19308.name());
        }
    }
}
