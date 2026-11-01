package l;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۚ᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1X6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5563 extends C14736 {

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f19078;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public Object f19079;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public AbstractC3445 f19080;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public String f19081;

    @Override // l.C14736
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14736 mo15353(long j) {
        throw null;
    }

    static {
        HashMap map = new HashMap();
        f19078 = map;
        map.put("alpha", C7680.f25432);
        map.put("pivotX", C7680.f25437);
        map.put("pivotY", C7680.f25435);
        map.put("translationX", C7680.f25442);
        map.put("translationY", C7680.f25438);
        map.put("rotation", C7680.f25430);
        map.put("rotationX", C7680.f25433);
        map.put("rotationY", C7680.f25441);
        map.put("scaleX", C7680.f25429);
        map.put("scaleY", C7680.f25436);
        map.put("scrollX", C7680.f25431);
        map.put("scrollY", C7680.f25434);
        map.put("x", C7680.f25440);
        map.put("y", C7680.f25439);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5563 m15349(Object obj, float... fArr) {
        C5563 c5563 = new C5563();
        c5563.f19079 = obj;
        C16147[] c16147Arr = c5563.f48183;
        if (c16147Arr != null) {
            C16147 c16147 = c16147Arr[0];
            String str = c16147.f52187;
            c16147.f52187 = "alpha";
            c5563.f48186.remove(str);
            c5563.f48186.put("alpha", c16147);
        }
        c5563.f19081 = "alpha";
        c5563.f48191 = false;
        c5563.mo15352(fArr);
        return c5563;
    }

    @Override // l.C14736
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15352(float... fArr) {
        C16147[] c16147Arr = this.f48183;
        if (c16147Arr == null || c16147Arr.length == 0) {
            AbstractC3445 abstractC3445 = this.f19080;
            if (abstractC3445 != null) {
                int i = C16147.f52178;
                m35313(new C21085(abstractC3445, fArr));
                return;
            }
            String str = this.f19081;
            int i2 = C16147.f52178;
            C21085 c21085 = new C21085(str);
            c21085.mo38226(fArr);
            m35313(c21085);
            return;
        }
        super.mo15352(fArr);
    }

    @Override // l.C14736
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo15350() {
        Object obj = this.f19079;
        if (this.f48191) {
            return;
        }
        if (this.f19080 == null && C3115.f11729 && (obj instanceof View)) {
            String str = this.f19081;
            HashMap map = f19078;
            if (map.containsKey(str)) {
                AbstractC3445 abstractC3445 = (AbstractC3445) map.get(this.f19081);
                C16147[] c16147Arr = this.f48183;
                if (c16147Arr != null) {
                    C16147 c16147 = c16147Arr[0];
                    String str2 = c16147.f52187;
                    c16147.f52189 = abstractC3445;
                    this.f48186.remove(str2);
                    this.f48186.put(this.f19081, c16147);
                }
                if (this.f19080 != null) {
                    this.f19081 = abstractC3445.m10150();
                }
                this.f19080 = abstractC3445;
                this.f48191 = false;
            }
        }
        int length = this.f48183.length;
        for (int i = 0; i < length; i++) {
            this.f48183[i].m38228(obj);
        }
        super.mo15350();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15354(long j) {
        super.mo15353(j);
    }

    @Override // l.C14736
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15351(float f) {
        super.mo15351(f);
        int length = this.f48183.length;
        for (int i = 0; i < length; i++) {
            this.f48183[i].mo38224(this.f19079);
        }
    }

    @Override // l.C14736, l.AbstractC1704
    /* JADX INFO: renamed from: clone */
    public final Object mo5666clone() {
        return (C5563) super.mo5666clone();
    }

    @Override // l.C14736, l.AbstractC1704
    /* JADX INFO: renamed from: clone */
    public final AbstractC1704 mo5666clone() {
        return (C5563) super.mo5666clone();
    }

    @Override // l.C14736, l.AbstractC1704
    /* JADX INFO: renamed from: clone */
    public final C14736 mo5666clone() {
        return (C5563) super.mo5666clone();
    }

    @Override // l.C14736
    public final String toString() {
        String string = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.f19079;
        if (this.f48183 != null) {
            for (int i = 0; i < this.f48183.length; i++) {
                StringBuilder sbM8976 = C3012.m8976(string, "\n    ");
                sbM8976.append(this.f48183[i].toString());
                string = sbM8976.toString();
            }
        }
        return string;
    }
}
