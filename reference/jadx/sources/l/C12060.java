package l;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۨۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1X6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12060 extends C11488 {

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f38846;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public Object f38847;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AbstractC17455 f38848;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public String f38849;

    @Override // l.C11488
    /* JADX INFO: renamed from: ᩷ */
    public final C11488 mo28882(long j) {
        throw null;
    }

    static {
        HashMap map = new HashMap();
        f38846 = map;
        map.put("alpha", C6840.f22731);
        map.put("pivotX", C6840.f22741);
        map.put("pivotY", C6840.f22733);
        map.put("translationX", C6840.f22743);
        map.put("translationY", C6840.f22738);
        map.put("rotation", C6840.f22742);
        map.put("rotationX", C6840.f22740);
        map.put("rotationY", C6840.f22736);
        map.put("scaleX", C6840.f22735);
        map.put("scaleY", C6840.f22732);
        map.put("scrollX", C6840.f22730);
        map.put("scrollY", C6840.f22734);
        map.put("x", C6840.f22739);
        map.put("y", C6840.f22737);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12060 m30238(Object obj, float... fArr) {
        C12060 c12060 = new C12060();
        c12060.f38847 = obj;
        C4777[] c4777Arr = c12060.f36153;
        if (c4777Arr != null) {
            C4777 c4777 = c4777Arr[0];
            String str = c4777.f16768;
            c4777.f16768 = "alpha";
            c12060.f36150.remove(str);
            c12060.f36150.put("alpha", c4777);
        }
        c12060.f38849 = "alpha";
        c12060.f36142 = false;
        c12060.mo28874(fArr);
        return c12060;
    }

    @Override // l.C11488
    /* JADX INFO: renamed from: ۙ */
    public final void mo28874(float... fArr) {
        C4777[] c4777Arr = this.f36153;
        if (c4777Arr == null || c4777Arr.length == 0) {
            AbstractC17455 abstractC17455 = this.f38848;
            if (abstractC17455 != null) {
                int i = C4777.f16757;
                m28875(new C13551(abstractC17455, fArr));
                return;
            }
            String str = this.f38849;
            int i2 = C4777.f16757;
            C13551 c13551 = new C13551(str);
            c13551.mo14747(fArr);
            m28875(c13551);
            return;
        }
        super.mo28874(fArr);
    }

    @Override // l.C11488
    /* JADX INFO: renamed from: ۤ */
    public final void mo28877() {
        Object obj = this.f38847;
        if (this.f36142) {
            return;
        }
        if (this.f38848 == null && C17281.f56289 && (obj instanceof View)) {
            String str = this.f38849;
            HashMap map = f38846;
            if (map.containsKey(str)) {
                AbstractC17455 abstractC17455 = (AbstractC17455) map.get(this.f38849);
                C4777[] c4777Arr = this.f36153;
                if (c4777Arr != null) {
                    C4777 c4777 = c4777Arr[0];
                    String str2 = c4777.f16768;
                    c4777.f16766 = abstractC17455;
                    this.f36150.remove(str2);
                    this.f36150.put(this.f38849, c4777);
                }
                if (this.f38848 != null) {
                    this.f38849 = abstractC17455.m40956();
                }
                this.f38848 = abstractC17455;
                this.f36142 = false;
            }
        }
        int length = this.f36153.length;
        for (int i = 0; i < length; i++) {
            this.f36153[i].m14749(obj);
        }
        super.mo28877();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30239(long j) {
        super.mo28882(j);
    }

    @Override // l.C11488
    /* JADX INFO: renamed from: ۙ */
    public final void mo28870(float f) {
        super.mo28870(f);
        int length = this.f36153.length;
        for (int i = 0; i < length; i++) {
            this.f36153[i].mo14745(this.f38847);
        }
    }

    @Override // l.C11488, l.AbstractC24741
    /* JADX INFO: renamed from: clone */
    public final Object mo28883clone() {
        return (C12060) super.mo28883clone();
    }

    @Override // l.C11488, l.AbstractC24741
    /* JADX INFO: renamed from: clone */
    public final C11488 mo28883clone() {
        return (C12060) super.mo28883clone();
    }

    @Override // l.C11488, l.AbstractC24741
    /* JADX INFO: renamed from: clone */
    public final AbstractC24741 mo28883clone() {
        return (C12060) super.mo28883clone();
    }

    @Override // l.C11488
    public final String toString() {
        String string = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.f38847;
        if (this.f36153 != null) {
            for (int i = 0; i < this.f36153.length; i++) {
                StringBuilder sbM10405 = C3188.m10405(string, "\n    ");
                sbM10405.append(this.f36153[i].toString());
                string = sbM10405.toString();
            }
        }
        return string;
    }
}
