package l;

/* JADX INFO: renamed from: l.᩷֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L57K */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20521 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f66497;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC20521 f66498;

    public AbstractC20521() {
        this(589824, null);
    }

    public AbstractC20521(int i, AbstractC20521 abstractC20521) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException(C8479.m22141(i, "Unsupported api "));
        }
        if (i == 17432576) {
            C6409.m17554(this);
        }
        this.f66497 = i;
        this.f66498 = abstractC20521;
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo35173(int i, String str) {
        if (this.f66497 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo35173(i, str);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC9812 mo33776() {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            return abstractC20521.mo33776();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC9812 mo33781(String str, boolean z) {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            return abstractC20521.mo33781(str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ */
    public AbstractC9812 mo33789(int i, C1470 c1470, String str, boolean z) {
        if (this.f66497 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            return abstractC20521.mo33789(i, c1470, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo35163(int i, boolean z) {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo35163(i, z);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC9812 mo33777(int i, String str, boolean z) {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            return abstractC20521.mo33777(i, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo35166(C11349 c11349) {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo35166(c11349);
        }
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo35171() {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo35171();
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo33782(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo33782(i, i2, i3, objArr, objArr2);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo35159(int i) {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo35159(i);
        }
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo35172(int i, int i2) {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo35172(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public void mo35158(int i, int i2) {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo35158(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo33790(int i, String str) {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo33790(i, str);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo33785(String str, int i, String str2, String str3) {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo33785(str, i, str2, str3);
        }
    }

    @Deprecated(forRemoval = false)
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46308(String str, int i, String str2, String str3) {
        mo33784(i | (this.f66497 < 327680 ? 256 : 0), str, str2, str3, i == 185);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo33784(int i, String str, String str2, String str3, boolean z) {
        if (this.f66497 < 327680 && (i & 256) == 0) {
            if (z != (i == 185)) {
                throw new UnsupportedOperationException("INVOKESPECIAL/STATIC on interfaces requires ASM5");
            }
            m46308(str, i, str2, str3);
        } else {
            AbstractC20521 abstractC20521 = this.f66498;
            if (abstractC20521 != null) {
                abstractC20521.mo33784(i & (-257), str, str2, str3, z);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo33787(String str, String str2, C19110 c19110, Object... objArr) {
        if (this.f66497 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo33787(str, str2, c19110, objArr);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo35162(int i, C9938 c9938) {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo35162(i, c9938);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo35164(C9938 c9938) {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo35164(c9938);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo8457(Object obj) {
        int i = this.f66497;
        if (i < 327680 && ((obj instanceof C19110) || ((obj instanceof C14172) && ((C14172) obj).m34269() == 11))) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        if (i < 458752 && (obj instanceof C3586)) {
            throw new UnsupportedOperationException("This feature requires ASM7");
        }
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo8457(obj);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo35160(int i, int i2) {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo35160(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo35161(int i, int i2, C9938 c9938, C9938... c9938Arr) {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo35161(i, i2, c9938, c9938Arr);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo35165(C9938 c9938, int[] iArr, C9938[] c9938Arr) {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo35165(c9938, iArr, c9938Arr);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo33783(int i, String str) {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo33783(i, str);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC9812 mo33778(int i, C1470 c1470, String str, boolean z) {
        if (this.f66497 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            return abstractC20521.mo33778(i, c1470, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo33788(C9938 c9938, C9938 c9939, C9938 c99310, String str) {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo33788(c9938, c9939, c99310, str);
        }
    }

    /* JADX INFO: renamed from: ܰ */
    public AbstractC9812 mo33791(int i, C1470 c1470, String str, boolean z) {
        if (this.f66497 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            return abstractC20521.mo33791(i, c1470, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo33786(String str, String str2, String str3, C9938 c9938, C9938 c9939, int i) {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo33786(str, str2, str3, c9938, c9939, i);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC9812 mo33779(int i, C1470 c1470, C9938[] c9938Arr, C9938[] c9938Arr2, int[] iArr, String str, boolean z) {
        if (this.f66497 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            return abstractC20521.mo33779(i, c1470, c9938Arr, c9938Arr2, iArr, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo35174(int i, C9938 c9938) {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo35174(i, c9938);
        }
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo35170(int i, int i2) {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo35170(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo35169() {
        AbstractC20521 abstractC20521 = this.f66498;
        if (abstractC20521 != null) {
            abstractC20521.mo35169();
        }
    }
}
