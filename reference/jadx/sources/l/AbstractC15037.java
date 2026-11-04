package l;

/* JADX INFO: renamed from: l.ܳۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: L57K */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15037 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f49089;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC15037 f49090;

    public AbstractC15037() {
        this(589824, null);
    }

    public AbstractC15037(int i, AbstractC15037 abstractC15037) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException(C13645.m33382(i, "Unsupported api "));
        }
        if (i == 17432576) {
            C10012.m25861(this);
        }
        this.f49089 = i;
        this.f49090 = abstractC15037;
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo10812(int i, String str) {
        if (this.f49089 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10812(i, str);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC3301 mo10782() {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            return abstractC15037.mo10782();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC3301 mo10786(String str, boolean z) {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            return abstractC15037.mo10786(str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ */
    public AbstractC3301 mo10805(int i, C20259 c20259, String str, boolean z) {
        if (this.f49089 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            return abstractC15037.mo10805(i, c20259, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10794(int i, boolean z) {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10794(i, z);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC3301 mo10783(int i, String str, boolean z) {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            return abstractC15037.mo10783(i, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10804(C24185 c24185) {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10804(c24185);
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo10810() {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10810();
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10789(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10789(i, i2, i3, objArr, objArr2);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10787(int i) {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10787(i);
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo10811(int i, int i2) {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10811(i, i2);
        }
    }

    /* JADX INFO: renamed from: ᩸ */
    public void mo10814(int i, int i2) {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10814(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۤ */
    public void mo10808(int i, String str) {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10808(i, str);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10796(String str, int i, String str2, String str3) {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10796(str, i, str2, str3);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36198(String str, int i, String str2, String str3) {
        mo10792(i | (this.f49089 < 327680 ? 256 : 0), str, str2, str3, i == 185);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10792(int i, String str, String str2, String str3, boolean z) {
        if (this.f49089 < 327680 && (i & 256) == 0) {
            if (z != (i == 185)) {
                throw new UnsupportedOperationException("INVOKESPECIAL/STATIC on interfaces requires ASM5");
            }
            m36198(str, i, str2, str3);
        } else {
            AbstractC15037 abstractC15037 = this.f49090;
            if (abstractC15037 != null) {
                abstractC15037.mo10792(i & (-257), str, str2, str3, z);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10798(String str, String str2, C4597 c4597, Object... objArr) {
        if (this.f49089 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10798(str, str2, c4597, objArr);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10793(int i, C10562 c10562) {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10793(i, c10562);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10800(C10562 c10562) {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10800(c10562);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10795(Object obj) {
        int i = this.f49089;
        if (i < 327680 && ((obj instanceof C4597) || ((obj instanceof C3105) && ((C3105) obj).m10140() == 11))) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        if (i < 458752 && (obj instanceof C18963)) {
            throw new UnsupportedOperationException("This feature requires ASM7");
        }
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10795(obj);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10788(int i, int i2) {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10788(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10790(int i, int i2, C10562 c10562, C10562... c10562Arr) {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10790(i, i2, c10562, c10562Arr);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10802(C10562 c10562, int[] iArr, C10562[] c10562Arr) {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10802(c10562, iArr, c10562Arr);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10791(int i, String str) {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10791(i, str);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC3301 mo10784(int i, C20259 c20259, String str, boolean z) {
        if (this.f49089 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            return abstractC15037.mo10784(i, c20259, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10801(C10562 c10562, C10562 c10563, C10562 c10564, String str) {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10801(c10562, c10563, c10564, str);
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public AbstractC3301 mo10809(int i, C20259 c20259, String str, boolean z) {
        if (this.f49089 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            return abstractC15037.mo10809(i, c20259, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10797(String str, String str2, String str3, C10562 c10562, C10562 c10563, int i) {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10797(str, str2, str3, c10562, c10563, i);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC3301 mo10785(int i, C20259 c20259, C10562[] c10562Arr, C10562[] c10562Arr2, int[] iArr, String str, boolean z) {
        if (this.f49089 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            return abstractC15037.mo10785(i, c20259, c10562Arr, c10562Arr2, iArr, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo10813(int i, C10562 c10562) {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10813(i, c10562);
        }
    }

    /* JADX INFO: renamed from: ۤ */
    public void mo10807(int i, int i2) {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10807(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۤ */
    public void mo10806() {
        AbstractC15037 abstractC15037 = this.f49090;
        if (abstractC15037 != null) {
            abstractC15037.mo10806();
        }
    }
}
