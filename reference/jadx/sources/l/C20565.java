package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷֫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: V6MU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20565 implements InterfaceC12471 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f66978;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C9919 f66979;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f66981;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f66984;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f66985;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f66986;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC1886 f66989;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C20502 f66991;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f66992;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f66993;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f66994;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f66995;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f66996;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f66999;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f67001;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f67002;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0103 f67003;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C20937 f67004;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f67005;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f67006;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f67007;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f67008;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C20232 f67012;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f67013;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final RectF f66983 = new RectF();

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final RectF f66988 = new RectF();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final RunnableC9982 f67010 = new Runnable() { // from class: l.ۤ֫۬
        @Override // java.lang.Runnable
        public final void run() {
            C20565.m46400(this.f34112);
        }
    };

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3297 f67011 = new C3297();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final RectF f67000 = new RectF();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f66980 = new HashMap();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashSet f67014 = new HashSet();

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public List f66998 = new ArrayList();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashMap f67016 = new HashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f67009 = new HashMap();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashSet f66987 = new HashSet();

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public volatile List f66982 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f66997 = new ArrayList();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f67015 = 2048;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f66990 = 2048;

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ۤ֫۬] */
    public C20565(C0103 c0103, int i, long j, AbstractC1886 abstractC1886) {
        this.f67003 = c0103;
        this.f66985 = c0103.f1070;
        this.f66993 = i;
        this.f67006 = j;
        this.f66989 = abstractC1886;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46407(Canvas canvas, Paint paint) {
        if (this.f67001) {
            return;
        }
        int maximumBitmapWidth = canvas.getMaximumBitmapWidth();
        int maximumBitmapHeight = canvas.getMaximumBitmapHeight();
        if (this.f67015 != maximumBitmapWidth || this.f66990 != maximumBitmapHeight) {
            this.f67015 = maximumBitmapWidth;
            this.f66990 = maximumBitmapHeight;
            this.f66984 = false;
        }
        if (this.f66979 != null) {
            int iSave = canvas.save();
            Iterator it = this.f67016.keySet().iterator();
            while (it.hasNext()) {
                canvas.clipRect(((C1036) it.next()).f4831, Region.Op.DIFFERENCE);
            }
            this.f66979.m25118(canvas, paint);
            canvas.restoreToCount(iSave);
            for (Map.Entry entry : this.f67016.entrySet()) {
                C1036 c1036 = (C1036) entry.getKey();
                int iSave2 = canvas.save();
                canvas.clipRect(c1036.f4831);
                canvas.drawBitmap(((C20232) entry.getValue()).f65655, (Rect) null, c1036.f4829, paint);
                canvas.restoreToCount(iSave2);
            }
            return;
        }
        if (this.f67012 == null) {
            return;
        }
        boolean zIsFilterBitmap = paint.isFilterBitmap();
        if (this.f67004.f68252 != null) {
            paint.setFilterBitmap(false);
        }
        try {
            RectF rectF = this.f67000;
            C20937 c20937 = this.f67004;
            rectF.set(0.0f, 0.0f, c20937.f68250, c20937.f68251);
            int iSave3 = canvas.save();
            for (int i = 0; i < this.f66997.size(); i++) {
                C22910 c22910 = ((C19860) this.f66997.get(i)).f63694;
                canvas.clipRect(c22910.f74476, c22910.f74475, c22910.f74472, c22910.f74478, Region.Op.DIFFERENCE);
            }
            canvas.drawBitmap(this.f67012.f65655, (Rect) null, this.f67000, paint);
            canvas.restoreToCount(iSave3);
            for (int i2 = 0; i2 < this.f66997.size(); i2++) {
                C19860 c19860 = (C19860) this.f66997.get(i2);
                int iSave4 = canvas.save();
                C22910 c22911 = c19860.f63694;
                canvas.clipRect(c22911.f74476, c22911.f74475, c22911.f74472, c22911.f74478);
                canvas.drawBitmap(c19860.f63693.f65655, (Rect) null, c19860.f63695, paint);
                canvas.restoreToCount(iSave4);
            }
        } finally {
            paint.setFilterBitmap(zIsFilterBitmap);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46408(RectF rectF, float f, boolean z) {
        if (!this.f67001 && this.f67003.f1066 && z && this.f67003.m1107(this)) {
            if (!this.f67003.f1068 && m46409() && this.f67003.f1057 != null && this.f67003.f1057.mo19706()) {
                f = this.f67003.f1057.mo19690(this.f66988);
                if (f <= 0.0f) {
                    return;
                } else {
                    rectF = this.f66988;
                }
            }
            C9919 c9919 = this.f66979;
            if ((c9919 == null || !c9919.m25121()) && (this.f66978 || this.f67012 == null)) {
                return;
            }
            if (this.f66984 && this.f66983.equals(rectF) && this.f66986 == f) {
                return;
            }
            if (m46409()) {
                long jM9803 = this.f67011.m9803(SystemClock.uptimeMillis(), rectF, this.f67003.f1057 != null && this.f67003.f1057.mo19687());
                this.f66983.set(rectF);
                this.f66986 = f;
                this.f67003.f1063.removeCallbacks(this.f67010);
                this.f66992 = true;
                this.f67003.f1063.postDelayed(this.f67010, jM9803);
                return;
            }
            this.f66983.set(rectF);
            this.f66986 = f;
            if (this.f66992) {
                return;
            }
            this.f66992 = true;
            this.f67003.f1063.post(this.f67010);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46400(C20565 c20565) {
        List listM36317;
        boolean z = false;
        c20565.f66992 = false;
        c20565.f67011.m9804();
        long jM46410 = c20565.m46410();
        if (c20565.f67001 || !c20565.f67003.f1066 || !c20565.f67003.m1107(c20565) || c20565.f66986 <= 0.0f) {
            return;
        }
        C9919 c9919 = c20565.f66979;
        if (c9919 != null && c9919.m25121()) {
            C20937 c20937 = c20565.f67004;
            List listM32249 = C13032.m32249(c20937.f68250, c20937.f68251, c20565.f66983, c20565.f66986, c20565.f66979.m25116(), jM46410);
            if (!listM32249.isEmpty() && !c20565.f67016.isEmpty() && !c20565.m46401((C1036) listM32249.get(0))) {
                Iterator it = c20565.f67016.values().iterator();
                long allocationByteCount = 0;
                while (it.hasNext()) {
                    allocationByteCount += (long) ((C20232) it.next()).f65655.getAllocationByteCount();
                }
                C20937 c20938 = c20565.f67004;
                List listM322410 = C13032.m32249(c20938.f68250, c20938.f68251, c20565.f66983, c20565.f66986, c20565.f66979.m25116(), Math.max(0L, jM46410 - allocationByteCount));
                listM32249 = (listM322410.isEmpty() || ((C1036) listM32249.get(0)).f4826 <= ((C1036) c20565.f67016.keySet().iterator().next()).f4826 || ((C1036) listM322410.get(0)).f4826 >= ((C1036) c20565.f67016.keySet().iterator().next()).f4826) ? listM322410 : new ArrayList();
            }
            c20565.f66984 = true;
            if (listM32249.equals(c20565.f66982)) {
                c20565.m46404();
                if (c20565.f67003.f1057 != null) {
                    c20565.f67003.f1057.invalidate();
                    return;
                }
                return;
            }
            c20565.f66982 = listM32249;
            c20565.f66987.retainAll(listM32249);
            if (listM32249.isEmpty()) {
                c20565.m46399();
            } else {
                boolean z2 = (c20565.f67016.isEmpty() || c20565.m46401((C1036) listM32249.get(0))) ? false : true;
                c20565.f66996 = z2;
                if (!z2) {
                    for (Map.Entry entry : c20565.f67009.entrySet()) {
                        if (listM32249.contains(entry.getKey())) {
                            C20232 c20232 = (C20232) c20565.f67016.put((C1036) entry.getKey(), (C20232) entry.getValue());
                            if (c20232 != null) {
                                c20232.close();
                            }
                        } else {
                            ((C20232) entry.getValue()).close();
                        }
                    }
                    c20565.f67009.clear();
                }
                Iterator it2 = (c20565.f66996 ? c20565.f67009 : c20565.f67016).entrySet().iterator();
                boolean z3 = false;
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!listM32249.contains(entry2.getKey())) {
                        ((C20232) entry2.getValue()).close();
                        it2.remove();
                        z3 = true;
                    }
                }
                if (z3) {
                    c20565.f66984 = false;
                }
                c20565.m46404();
            }
            if (c20565.f67003.f1057 != null) {
                c20565.f67003.f1057.invalidate();
            }
            c20565.f67003.m1093();
            return;
        }
        if (c20565.f67012 == null) {
            return;
        }
        if (c20565.m46409()) {
            C20937 c20939 = c20565.f67004;
            listM36317 = C4336.m12169(c20939.f68250, c20939.f68251, c20565.f66983, c20565.f66986, c20565.f67012.f65654, jM46410, c20565.f67015, c20565.f66990);
        } else {
            C20937 c209310 = c20565.f67004;
            listM36317 = C15149.m36317(c209310.f68250, c209310.f68251, c20565.f66983, c20565.f66986, c20565.f67012.f65654, jM46410);
        }
        if (c20565.m46409() && !listM36317.isEmpty()) {
            for (C22910 c22910 : c20565.f66980.keySet()) {
                RectF rectF = c20565.f66983;
                C20937 c209311 = c20565.f67004;
                if (C4336.m12172(c22910, rectF, c209311.f68250, c209311.f68251, ((C22910) listM36317.get(0)).f74477)) {
                    listM36317 = Collections.singletonList(c22910);
                    break;
                }
            }
        }
        if (listM36317.equals(c20565.f66998)) {
            c20565.f66984 = true;
            if (c20565.f67003.m1099() != null) {
                c20565.f67003.m1093();
                return;
            }
            return;
        }
        c20565.f66998 = listM36317;
        c20565.f66984 = true;
        c20565.f67014.retainAll(listM36317);
        if (c20565.m46409() && !listM36317.isEmpty()) {
            z = true;
        }
        Iterator it3 = c20565.f66980.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            if (!listM36317.contains(entry3.getKey()) && !z) {
                ((C19860) entry3.getValue()).f63693.close();
                it3.remove();
            }
        }
        ArrayList arrayList = c20565.f66997;
        arrayList.clear();
        arrayList.addAll(c20565.f66980.values());
        if (c20565.f67003.f1057 != null) {
            c20565.f67003.f1057.invalidate();
        }
        c20565.f67003.m1093();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m46410() {
        int i = 0;
        if (this.f67003.f1068) {
            int i2 = 0;
            while (i < this.f67003.f1054.size()) {
                if (((C20565) this.f67003.f1054.valueAt(i)).f67013) {
                    i2++;
                }
                i++;
            }
            return Math.min(this.f66985, (this.f67003.f1047.m3238() / 2) / ((long) Math.max(1, i2))) / ((long) (m46409() ? 2 : 1));
        }
        long jMax = this.f67003.f1065;
        if (this.f67003.f1049 != null) {
            jMax += Math.max(0L, this.f67003.f1049.m46301() - this.f67003.f1056);
        }
        while (i < this.f67003.f1054.size()) {
            C20565 c20565 = (C20565) this.f67003.f1054.valueAt(i);
            C20232 c20232 = c20565.f67012;
            if (c20232 != null) {
                jMax += Math.max(0L, ((long) c20232.f65655.getAllocationByteCount()) - this.f67003.f1056);
            }
            C9919 c9919 = c20565.f66979;
            if (c9919 != null) {
                jMax = Math.max(0L, c9919.m25122() - this.f67003.f1056) + jMax;
            }
            i++;
        }
        long jMax2 = Math.max(0L, this.f66985 - jMax);
        if (m46409()) {
            return Math.min(jMax2, Math.max(0L, (this.f67003.f1070 + (this.f67003.f1056 * ((long) (3 - Math.min(3, this.f67003.f1069.size()))))) - jMax) / 2);
        }
        return jMax2;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m46409() {
        C20937 c20937 = this.f67004;
        if (c20937 != null) {
            return c20937.f68252 != null || "image/png".equals(c20937.f68249);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m46401(C1036 c1036) {
        C1036 c1037 = (C1036) this.f67016.keySet().iterator().next();
        return c1036.f4827 == c1037.f4827 && c1036.f4830 == c1037.f4830;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m46404() {
        if (this.f66992 || !this.f66996 || this.f66982.isEmpty()) {
            return;
        }
        boolean z = false;
        for (C1036 c1036 : this.f66982) {
            if (RectF.intersects(c1036.f4831, this.f66983)) {
                if (!this.f67009.containsKey(c1036)) {
                    return;
                } else {
                    z = true;
                }
            }
        }
        if (z) {
            Iterator it = this.f67016.values().iterator();
            while (it.hasNext()) {
                ((C20232) it.next()).close();
            }
            this.f67016.clear();
            this.f67016.putAll(this.f67009);
            this.f67009.clear();
            this.f66996 = false;
            this.f66984 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public void m46399() {
        HashMap map = this.f67009;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C20232) it.next()).close();
        }
        map.clear();
        this.f66996 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.۟֫۬] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m46405() {
        C9919 c9919 = this.f66979;
        if (c9919 != 0) {
            c9919.m25120(!this.f67001 && this.f67003.f1066 && this.f67003.f1055 == this && !this.f67008, (RunnableC7159) new Runnable() { // from class: l.۟֫۬
                @Override // java.lang.Runnable
                public final void run() {
                    C20565 c20565 = this.f23925;
                    if (c20565.f67001 || c20565.f67003.f1057 == null || !c20565.f67003.f1066 || c20565.f67003.f1055 != c20565) {
                        return;
                    }
                    c20565.f67003.f1057.invalidate();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46406() {
        this.f67011.m9805();
        this.f67003.f1063.removeCallbacks(this.f67010);
        this.f66992 = false;
        m46399();
        this.f66982 = new ArrayList();
        Iterator it = this.f67016.values().iterator();
        while (it.hasNext()) {
            ((C20232) it.next()).close();
        }
        this.f67016.clear();
        this.f66987.clear();
        Iterator it2 = this.f66980.values().iterator();
        while (it2.hasNext()) {
            ((C19860) it2.next()).f63693.close();
        }
        this.f66980.clear();
        this.f66997.clear();
        this.f66984 = false;
        this.f66998 = new ArrayList();
        this.f67014.clear();
        this.f66986 = 0.0f;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46411() {
        if (this.f67001) {
            return;
        }
        this.f67001 = true;
        m46406();
        C20232 c20232 = this.f67012;
        if (c20232 != null) {
            c20232.close();
        }
        this.f67012 = null;
        C9919 c9919 = this.f66979;
        if (c9919 != null) {
            c9919.m25119(this.f66991);
        } else {
            C20502 c20502 = this.f66991;
            if (c20502 != null) {
                c20502.close();
            }
        }
        this.f66979 = null;
        this.f66991 = null;
    }
}
