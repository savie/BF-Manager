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

/* JADX INFO: renamed from: l.ۜۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V6MU */
/* JADX INFO: loaded from: classes3.dex */
public final class C7091 implements InterfaceC4854 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f23360;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f23361;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f23362;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22403 f23363;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f23364;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C8299 f23365;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f23366;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f23367;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f23369;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f23370;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f23371;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC13057 f23374;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f23378;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15010 f23379;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f23381;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f23383;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C9044 f23384;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile boolean f23385;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f23386;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f23387;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile boolean f23392;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f23393;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f23394;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C9153 f23397;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final RectF f23380 = new RectF();

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final RectF f23389 = new RectF();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final RunnableC2616 f23390 = new Runnable() { // from class: l.ۖۧ֫
        @Override // java.lang.Runnable
        public final void run() {
            C7091.m19425(this.f8402);
        }
    };

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1871 f23391 = new C1871();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final RectF f23368 = new RectF();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final HashMap f23372 = new HashMap();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashSet f23382 = new HashSet();

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public List f23376 = new ArrayList();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final HashMap f23373 = new HashMap();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f23396 = new HashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashSet f23388 = new HashSet();

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public volatile List f23395 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f23375 = new ArrayList();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f23398 = 2048;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f23377 = 2048;

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ۖۧ֫] */
    public C7091(C22403 c22403, int i, long j, AbstractC13057 abstractC13057) {
        this.f23363 = c22403;
        this.f23366 = c22403.f72577;
        this.f23378 = i;
        this.f23360 = j;
        this.f23374 = abstractC13057;
    }

    @Override // l.InterfaceC4854
    public final int getWidth() {
        return this.f23384.f29428;
    }

    @Override // l.InterfaceC4854
    public final int getHeight() {
        return this.f23384.f29431;
    }

    @Override // l.InterfaceC4854
    /* JADX INFO: renamed from: ۙ */
    public final int mo2501() {
        return this.f23384.f29434;
    }

    @Override // l.InterfaceC4854
    /* JADX INFO: renamed from: ۙ */
    public final void mo2502(Canvas canvas, Paint paint) {
        if (this.f23392) {
            return;
        }
        int maximumBitmapWidth = canvas.getMaximumBitmapWidth();
        int maximumBitmapHeight = canvas.getMaximumBitmapHeight();
        if (this.f23398 != maximumBitmapWidth || this.f23377 != maximumBitmapHeight) {
            this.f23398 = maximumBitmapWidth;
            this.f23377 = maximumBitmapHeight;
            this.f23362 = false;
        }
        if (this.f23379 != null) {
            int iSave = canvas.save();
            Iterator it = this.f23373.keySet().iterator();
            while (it.hasNext()) {
                canvas.clipRect(((C4503) it.next()).f16077, Region.Op.DIFFERENCE);
            }
            this.f23379.m36153(canvas, paint);
            canvas.restoreToCount(iSave);
            for (Map.Entry entry : this.f23373.entrySet()) {
                C4503 c4503 = (C4503) entry.getKey();
                int iSave2 = canvas.save();
                canvas.clipRect(c4503.f16077);
                canvas.drawBitmap(((C8299) entry.getValue()).f27263, (Rect) null, c4503.f16076, paint);
                canvas.restoreToCount(iSave2);
            }
            return;
        }
        if (this.f23365 == null) {
            return;
        }
        boolean zIsFilterBitmap = paint.isFilterBitmap();
        if (this.f23384.f29432 != null) {
            paint.setFilterBitmap(false);
        }
        try {
            RectF rectF = this.f23368;
            C9044 c9044 = this.f23384;
            rectF.set(0.0f, 0.0f, c9044.f29428, c9044.f29431);
            int iSave3 = canvas.save();
            for (int i = 0; i < this.f23375.size(); i++) {
                C0774 c0774 = ((C5249) this.f23375.get(i)).f18498;
                canvas.clipRect(c0774.f2796, c0774.f2799, c0774.f2801, c0774.f2800, Region.Op.DIFFERENCE);
            }
            canvas.drawBitmap(this.f23365.f27263, (Rect) null, this.f23368, paint);
            canvas.restoreToCount(iSave3);
            for (int i2 = 0; i2 < this.f23375.size(); i2++) {
                C5249 c5249 = (C5249) this.f23375.get(i2);
                int iSave4 = canvas.save();
                C0774 c0775 = c5249.f18498;
                canvas.clipRect(c0775.f2796, c0775.f2799, c0775.f2801, c0775.f2800);
                canvas.drawBitmap(c5249.f18497.f27263, (Rect) null, c5249.f18499, paint);
                canvas.restoreToCount(iSave4);
            }
        } finally {
            paint.setFilterBitmap(zIsFilterBitmap);
        }
    }

    @Override // l.InterfaceC4854
    /* JADX INFO: renamed from: ۙ */
    public final void mo2503(RectF rectF, float f, boolean z) {
        if (!this.f23392 && this.f23363.f72565 && z && this.f23363.m50527(this)) {
            if (!this.f23363.f72571 && m19432() && this.f23363.f72553 != null && this.f23363.f72553.mo1647()) {
                f = this.f23363.f72553.mo33374(this.f23389);
                if (f <= 0.0f) {
                    return;
                } else {
                    rectF = this.f23389;
                }
            }
            C15010 c15010 = this.f23379;
            if ((c15010 == null || !c15010.m36156()) && (this.f23386 || this.f23365 == null)) {
                return;
            }
            if (this.f23362 && this.f23380.equals(rectF) && this.f23367 == f) {
                return;
            }
            if (m19432()) {
                long jM6419 = this.f23391.m6419(SystemClock.uptimeMillis(), rectF, this.f23363.f72553 != null && this.f23363.f72553.mo1652());
                this.f23380.set(rectF);
                this.f23367 = f;
                this.f23363.f72575.removeCallbacks(this.f23390);
                this.f23364 = true;
                this.f23363.f72575.postDelayed(this.f23390, jM6419);
                return;
            }
            this.f23380.set(rectF);
            this.f23367 = f;
            if (this.f23364) {
                return;
            }
            this.f23364 = true;
            this.f23363.f72575.post(this.f23390);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19425(C7091 c7091) {
        List listM22149;
        boolean z = false;
        c7091.f23364 = false;
        c7091.f23391.m6420();
        long jM19431 = c7091.m19431();
        if (c7091.f23392 || !c7091.f23363.f72565 || !c7091.f23363.m50527(c7091) || c7091.f23367 <= 0.0f) {
            return;
        }
        C15010 c15010 = c7091.f23379;
        if (c15010 != null && c15010.m36156()) {
            C9044 c9044 = c7091.f23384;
            List listM35969 = C14943.m35969(c9044.f29428, c9044.f29431, c7091.f23380, c7091.f23367, c7091.f23379.m36157(), jM19431);
            if (!listM35969.isEmpty() && !c7091.f23373.isEmpty() && !c7091.m19426((C4503) listM35969.get(0))) {
                Iterator it = c7091.f23373.values().iterator();
                long allocationByteCount = 0;
                while (it.hasNext()) {
                    allocationByteCount += (long) ((C8299) it.next()).f27263.getAllocationByteCount();
                }
                C9044 c9045 = c7091.f23384;
                List listM359610 = C14943.m35969(c9045.f29428, c9045.f29431, c7091.f23380, c7091.f23367, c7091.f23379.m36157(), Math.max(0L, jM19431 - allocationByteCount));
                listM35969 = (listM359610.isEmpty() || ((C4503) listM35969.get(0)).f16074 <= ((C4503) c7091.f23373.keySet().iterator().next()).f16074 || ((C4503) listM359610.get(0)).f16074 >= ((C4503) c7091.f23373.keySet().iterator().next()).f16074) ? listM359610 : new ArrayList();
            }
            c7091.f23362 = true;
            if (listM35969.equals(c7091.f23395)) {
                c7091.m19429();
                if (c7091.f23363.f72553 != null) {
                    c7091.f23363.f72553.invalidate();
                    return;
                }
                return;
            }
            c7091.f23395 = listM35969;
            c7091.f23388.retainAll(listM35969);
            if (listM35969.isEmpty()) {
                c7091.m19428();
            } else {
                boolean z2 = (c7091.f23373.isEmpty() || c7091.m19426((C4503) listM35969.get(0))) ? false : true;
                c7091.f23361 = z2;
                if (!z2) {
                    for (Map.Entry entry : c7091.f23396.entrySet()) {
                        if (listM35969.contains(entry.getKey())) {
                            C8299 c8299 = (C8299) c7091.f23373.put((C4503) entry.getKey(), (C8299) entry.getValue());
                            if (c8299 != null) {
                                c8299.close();
                            }
                        } else {
                            ((C8299) entry.getValue()).close();
                        }
                    }
                    c7091.f23396.clear();
                }
                Iterator it2 = (c7091.f23361 ? c7091.f23396 : c7091.f23373).entrySet().iterator();
                boolean z3 = false;
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!listM35969.contains(entry2.getKey())) {
                        ((C8299) entry2.getValue()).close();
                        it2.remove();
                        z3 = true;
                    }
                }
                if (z3) {
                    c7091.f23362 = false;
                }
                c7091.m19429();
            }
            if (c7091.f23363.f72553 != null) {
                c7091.f23363.f72553.invalidate();
            }
            c7091.f23363.m50533();
            return;
        }
        if (c7091.f23365 == null) {
            return;
        }
        if (c7091.m19432()) {
            C9044 c9046 = c7091.f23384;
            listM22149 = C11565.m29095(c9046.f29428, c9046.f29431, c7091.f23380, c7091.f23367, c7091.f23365.f27262, jM19431, c7091.f23398, c7091.f23377);
        } else {
            C9044 c9047 = c7091.f23384;
            listM22149 = C8232.m22149(c9047.f29428, c9047.f29431, c7091.f23380, c7091.f23367, c7091.f23365.f27262, jM19431);
        }
        if (c7091.m19432() && !listM22149.isEmpty()) {
            for (C0774 c0774 : c7091.f23372.keySet()) {
                RectF rectF = c7091.f23380;
                C9044 c9048 = c7091.f23384;
                if (C11565.m29098(c0774, rectF, c9048.f29428, c9048.f29431, ((C0774) listM22149.get(0)).f2795)) {
                    listM22149 = Collections.singletonList(c0774);
                    break;
                }
            }
        }
        if (listM22149.equals(c7091.f23376)) {
            c7091.f23362 = true;
            if (c7091.f23363.m50510() != null) {
                c7091.f23363.m50533();
                return;
            }
            return;
        }
        c7091.f23376 = listM22149;
        c7091.f23362 = true;
        c7091.f23382.retainAll(listM22149);
        if (c7091.m19432() && !listM22149.isEmpty()) {
            z = true;
        }
        Iterator it3 = c7091.f23372.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            if (!listM22149.contains(entry3.getKey()) && !z) {
                ((C5249) entry3.getValue()).f18497.close();
                it3.remove();
            }
        }
        ArrayList arrayList = c7091.f23375;
        arrayList.clear();
        arrayList.addAll(c7091.f23372.values());
        if (c7091.f23363.f72553 != null) {
            c7091.f23363.f72553.invalidate();
        }
        c7091.f23363.m50533();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m19431() {
        int i = 0;
        if (this.f23363.f72571) {
            int i2 = 0;
            while (i < this.f23363.f72572.size()) {
                if (((C7091) this.f23363.f72572.valueAt(i)).f23385) {
                    i2++;
                }
                i++;
            }
            return Math.min(this.f23366, (this.f23363.f72570.m8241() / 2) / ((long) Math.max(1, i2))) / ((long) (m19432() ? 2 : 1));
        }
        long jMax = this.f23363.f72568;
        if (this.f23363.f72558 != null) {
            jMax += Math.max(0L, this.f23363.f72558.m24287() - this.f23363.f72562);
        }
        while (i < this.f23363.f72572.size()) {
            C7091 c7091 = (C7091) this.f23363.f72572.valueAt(i);
            C8299 c8299 = c7091.f23365;
            if (c8299 != null) {
                jMax += Math.max(0L, ((long) c8299.f27263.getAllocationByteCount()) - this.f23363.f72562);
            }
            C15010 c15010 = c7091.f23379;
            if (c15010 != null) {
                jMax = Math.max(0L, c15010.m36159() - this.f23363.f72562) + jMax;
            }
            i++;
        }
        long jMax2 = Math.max(0L, this.f23366 - jMax);
        if (m19432()) {
            return Math.min(jMax2, Math.max(0L, (this.f23363.f72577 + (this.f23363.f72562 * ((long) (3 - Math.min(3, this.f23363.f72567.size()))))) - jMax) / 2);
        }
        return jMax2;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m19432() {
        C9044 c9044 = this.f23384;
        if (c9044 == null) {
            return false;
        }
        if (c9044.f29432 != null || "image/png".equals(c9044.f29436)) {
            return true;
        }
        if ("image/jpeg".equals(this.f23384.f29436)) {
            C9044 c9045 = this.f23384;
            if (((long) c9045.f29428) * ((long) c9045.f29431) > C6808.f22671.f22674) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m19426(C4503 c4503) {
        C4503 c4504 = (C4503) this.f23373.keySet().iterator().next();
        return c4503.f16078 == c4504.f16078 && c4503.f16073 == c4504.f16073;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m19429() {
        if (this.f23364 || !this.f23361 || this.f23395.isEmpty()) {
            return;
        }
        boolean z = false;
        for (C4503 c4503 : this.f23395) {
            if (RectF.intersects(c4503.f16077, this.f23380)) {
                if (!this.f23396.containsKey(c4503)) {
                    return;
                } else {
                    z = true;
                }
            }
        }
        if (z) {
            Iterator it = this.f23373.values().iterator();
            while (it.hasNext()) {
                ((C8299) it.next()).close();
            }
            this.f23373.clear();
            this.f23373.putAll(this.f23396);
            this.f23396.clear();
            this.f23361 = false;
            this.f23362 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public void m19428() {
        HashMap map = this.f23396;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C8299) it.next()).close();
        }
        map.clear();
        this.f23361 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.۠ۧ֫] */
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
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m19434() {
        C15010 c15010 = this.f23379;
        if (c15010 != 0) {
            c15010.m36155(!this.f23392 && this.f23363.f72565 && this.f23363.f72560 == this && !this.f23383, (RunnableC8582) new Runnable() { // from class: l.۠ۧ֫
                @Override // java.lang.Runnable
                public final void run() {
                    C7091 c7091 = this.f28062;
                    if (c7091.f23392 || c7091.f23363.f72553 == null || !c7091.f23363.f72565 || c7091.f23363.f72560 != c7091) {
                        return;
                    }
                    c7091.f23363.f72553.invalidate();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19433() {
        this.f23391.m6421();
        this.f23363.f72575.removeCallbacks(this.f23390);
        this.f23364 = false;
        m19428();
        this.f23395 = new ArrayList();
        Iterator it = this.f23373.values().iterator();
        while (it.hasNext()) {
            ((C8299) it.next()).close();
        }
        this.f23373.clear();
        this.f23388.clear();
        Iterator it2 = this.f23372.values().iterator();
        while (it2.hasNext()) {
            ((C5249) it2.next()).f18497.close();
        }
        this.f23372.clear();
        this.f23375.clear();
        this.f23362 = false;
        this.f23376 = new ArrayList();
        this.f23382.clear();
        this.f23367 = 0.0f;
    }

    @Override // l.InterfaceC4854
    public final void close() {
        if (this.f23392) {
            return;
        }
        this.f23392 = true;
        m19433();
        C8299 c8299 = this.f23365;
        if (c8299 != null) {
            c8299.close();
        }
        this.f23365 = null;
        C15010 c15010 = this.f23379;
        if (c15010 != null) {
            c15010.m36154(this.f23397);
        } else {
            C9153 c9153 = this.f23397;
            if (c9153 != null) {
                c9153.close();
            }
        }
        this.f23379 = null;
        this.f23397 = null;
    }
}
