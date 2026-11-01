package l;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.function.ToIntFunction;
import moe.shizuku.server.IShizukuApplication;

/* JADX INFO: renamed from: l.ۢ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes3.dex */
public class C9886 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final C22959 f33734 = C22959.m50798();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C3534 f33735;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C13498 f33736;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f33737;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC7769 f33738;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f33739;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC2207 f33740;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f33741;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC21174 f33742;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Drawable f33743;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ArrayList f33744;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Drawable f33745;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public HashSet f33746;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f33747;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public long f33748;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public long f33749;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f33750;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Set f33751;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f33752;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f33753;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f33754;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C17492 f33755;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f33756;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence mo24993(String str, String str2, boolean z) {
        return str2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean mo25016(String str) {
        return true;
    }

    /* JADX INFO: renamed from: ۬ */
    public int mo14206() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo14208() {
        return false;
    }

    public C9886() {
        this(m24978("C"));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Drawable[] m24978(String str) {
        AbstractC16214 abstractC16214 = C0690.f2905;
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        if (C20368.f65967) {
            paint.setShadowLayer(2.5f, 1.0f, 1.0f, 1342177280);
        }
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(Typeface.MONOSPACE);
        paint2.setTextSize(C13932.m33770(14 - str.length()));
        int iM33769 = C13932.m33769(25.0f);
        int iM337610 = C13932.m33769(12.5f);
        int iM337611 = C13932.m33769(11.0f);
        int iM337612 = C13932.m33769(5.0f);
        int iM337613 = C13932.m33769(2.0f);
        paint2.setColor(abstractC16214.mo38328());
        paint2.setAlpha(C20368.m45983(200, 255));
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        float f3 = iM337610;
        float f4 = (f3 - f2) - ((f - f2) / 2.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM33769, iM33769, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        paint.setColor(abstractC16214.mo38326());
        canvas.drawCircle(f3, f3, iM337611, paint);
        canvas.drawText(str, f3, f4, paint2);
        C5901 c5901 = new C5901();
        c5901.f20137 = iM33769;
        c5901.f20133 = iM337610;
        c5901.f20134 = iM337613;
        c5901.f20136 = iM337612;
        c5901.f20139 = null;
        return new Drawable[]{new BitmapDrawable(bitmapCreateBitmap), new BitmapDrawable(RunnableC23541.m51892(c5901, C0690.f2885, R.drawable.MT_Protector))};
    }

    public C9886(Drawable[] drawableArr) {
        this.f33750 = C13932.m33769(25.0f);
        this.f33741 = C13932.m33769(17.0f);
        this.f33752 = false;
        this.f33756 = false;
        this.f33737 = new ArrayList();
        C13498 c13498 = new C13498();
        c13498.f44598 = new ArrayList();
        this.f33736 = c13498;
        this.f33746 = new HashSet();
        this.f33744 = new ArrayList();
        this.f33751 = Collections.newSetFromMap(new WeakHashMap());
        this.f33743 = drawableArr[0];
        this.f33745 = drawableArr[1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24996(int i, Collection collection) {
        C22627 c22627M50152 = C22627.m50152(collection);
        c22627M50152.m50156(i);
        m25004(c22627M50152.m50155());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25004(C5693 c5693) {
        C13498 c13498 = this.f33736;
        ArrayList arrayList = c13498.f44598;
        ArrayList arrayList2 = c13498.f44598;
        arrayList.clear();
        for (C5693 c5694 : c5693.m15698()) {
            C3534 c3534 = new C3534(c5694, (C3534) null);
            arrayList2.add(c3534);
            m24983(c5694, c3534);
        }
        Iterator it = c5693.m15703().iterator();
        while (it.hasNext()) {
            arrayList2.add(new C3534((C14161) it.next(), (C3534) null));
        }
        ArrayList arrayList3 = this.f33737;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        this.f33744.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24983(C5693 c5693, C3534 c3534) {
        ArrayList arrayList = c3534.f13024;
        for (C5693 c5694 : c5693.m15698()) {
            C3534 c3535 = new C3534(c5694, c3534);
            arrayList.add(c3535);
            m24983(c5694, c3535);
        }
        Iterator it = c5693.m15703().iterator();
        while (it.hasNext()) {
            arrayList.add(new C3534((C14161) it.next(), c3534));
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C13498 m24992() {
        return this.f33736;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m25014() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f33737;
            if (i < arrayList.size()) {
                C3534 c3534 = (C3534) arrayList.get(i);
                if (c3534.m10413()) {
                    int i2 = i + 1;
                    int iM24986 = m24986(c3534);
                    if (iM24986 > 0) {
                        arrayList.subList(i2, iM24986 + i2).clear();
                    }
                }
                i++;
            } else {
                this.f33744.clear();
                notifyDataSetChanged();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25008(boolean z) {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.f33737;
            if (i >= arrayList.size()) {
                break;
            }
            C3534 c3534 = (C3534) arrayList.get(i);
            if (!c3534.m10396() && !c3534.m10413()) {
                m24982(c3534, false, z);
            }
            i++;
        }
        if (z && mo14208()) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C3534 c3535 = (C3534) arrayList.get(i2);
                if (c3535.m10396() && !c3535.m10399() && !c3535.m10413()) {
                    m24982(c3535, false, z);
                }
            }
        }
        this.f33744.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m25011() {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.f33737;
            if (i >= arrayList.size()) {
                break;
            }
            C3534 c3534 = (C3534) arrayList.get(i);
            if (!c3534.m10396() && !c3534.m10413()) {
                m24982(c3534, false, true);
                if (arrayList.size() >= 200) {
                    break;
                }
            }
            i++;
        }
        if (mo14208()) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C3534 c3535 = (C3534) arrayList.get(i2);
                if (c3535.m10396() && !c3535.m10399() && !c3535.m10413()) {
                    m24982(c3535, false, true);
                    if (arrayList.size() >= 200) {
                        break;
                    }
                }
            }
        }
        this.f33744.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashSet m25024() {
        HashSet hashSet = new HashSet();
        for (C3534 c3534 : this.f33737) {
            boolean zM10413 = c3534.m10413();
            String str = c3534.f13022;
            if (zM10413) {
                if (c3534.m10396()) {
                    hashSet.add(str);
                } else {
                    hashSet.add(str + "/");
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24999(HashSet hashSet) {
        this.f33737.clear();
        m24980(hashSet, (C3534) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24980(HashSet hashSet, C3534 c3534) {
        for (C3534 c3535 : c3534 == null ? this.f33736.f44598 : c3534.f13024) {
            ArrayList arrayList = this.f33737;
            arrayList.add(c3535);
            boolean zM10396 = c3535.m10396();
            String str = c3535.f13022;
            if (!zM10396) {
                boolean zContains = hashSet.contains(str + "/");
                c3535.m10408(zContains);
                if (zContains) {
                    m24980(hashSet, c3535);
                }
            } else if (mo14208()) {
                boolean zContains2 = hashSet.contains(str);
                c3535.m10408(zContains2);
                if (zContains2) {
                    int iMo14207 = mo14207(str);
                    c3535.m10401(iMo14207);
                    for (int i = 0; i < iMo14207; i++) {
                        arrayList.add(new C3534(i, c3535));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m25015(C3534 c3534) {
        ArrayList arrayList = this.f33737;
        int iIndexOf = arrayList.indexOf(c3534);
        if (iIndexOf == -1) {
            return;
        }
        int i = iIndexOf + 1;
        int iM24986 = m24986(c3534);
        if (iM24986 > 0) {
            arrayList.subList(i, i + iM24986).clear();
            notifyItemRangeRemoved(mo14206() + i, iM24986);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m24986(C3534 c3534) {
        int iM10397;
        if (!c3534.m10413()) {
            return 0;
        }
        if (c3534.m10396()) {
            if (!mo14208() || c3534.m10399()) {
                throw new RuntimeException();
            }
            iM10397 = c3534.m10397();
        } else {
            Iterator it = c3534.f13024.iterator();
            int iM24986 = 0;
            while (it.hasNext()) {
                iM24986 += m24986((C3534) it.next()) + 1;
            }
            iM10397 = iM24986;
        }
        c3534.m10408(false);
        return iM10397;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25002(C3534 c3534) {
        m24982(c3534, true, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24982(C3534 c3534, boolean z, boolean z2) {
        int i;
        ArrayList arrayList = this.f33737;
        int iIndexOf = arrayList.indexOf(c3534);
        if (iIndexOf == -1) {
            return;
        }
        int i2 = iIndexOf + 1;
        c3534.m10408(true);
        ArrayList<C3534> arrayList2 = c3534.f13024;
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C3534 c3535 = (C3534) it.next();
            c3535.m10408(false);
            c3535.m10405(false);
        }
        if (z2 && mo14208()) {
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            if (c3534.m10396()) {
                if (c3534.m10399()) {
                    throw new RuntimeException();
                }
                int iMo14207 = mo14207(c3534.f13022);
                c3534.m10401(iMo14207);
                for (i = 0; i < iMo14207; i++) {
                    arrayList3.add(new C3534(i, c3534));
                }
            } else {
                for (C3534 c3536 : arrayList2) {
                    arrayList3.add(c3536);
                    if (c3536.m10396()) {
                        c3536.m10408(true);
                        int iMo14208 = mo14207(c3536.f13022);
                        c3536.m10401(iMo14208);
                        for (int i3 = 0; i3 < iMo14208; i3++) {
                            arrayList3.add(new C3534(i3, c3536));
                        }
                    }
                }
            }
            arrayList2 = arrayList3;
        } else if (c3534.m10396()) {
            throw new RuntimeException();
        }
        arrayList.addAll(i2, arrayList2);
        if (z) {
            notifyItemRangeInserted(mo14206() + i2, arrayList2.size());
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList m24989() {
        return this.f33737;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25005(InterfaceC7769 interfaceC7769) {
        this.f33738 = interfaceC7769;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25007(InterfaceC21174 interfaceC21174) {
        this.f33742 = interfaceC21174;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25001(InterfaceC2207 interfaceC2207) {
        this.f33740 = interfaceC2207;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25010(View view, C3534 c3534, AbstractViewOnClickListenerC5030 abstractViewOnClickListenerC5030) {
        InterfaceC7769 interfaceC7769 = this.f33738;
        if (c3534 == null || interfaceC7769 == null) {
            return false;
        }
        return interfaceC7769.mo6612(new C11381(this, abstractViewOnClickListenerC5030, view));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24997(View view, C3534 c3534, C9181 c9181) {
        if (mo14208() && mo14207(c3534.f13022) > 0) {
            if (!c3534.m10413()) {
                m24982(c3534, true, true);
                return;
            } else {
                m25015(c3534);
                return;
            }
        }
        InterfaceC21174 interfaceC21174 = this.f33742;
        if (c3534 == null || interfaceC21174 == null) {
            return;
        }
        if (!c3534.m10396()) {
            throw new RuntimeException();
        }
        interfaceC21174.mo6613(new C11381(this, c9181, view));
    }

    @Override // l.AbstractC0414
    public final void onAttachedToRecyclerView(C17492 c17492) {
        super.onAttachedToRecyclerView(c17492);
        C17492 c17493 = this.f33755;
        if (c17493 != null && c17493 != c17492) {
            throw new RuntimeException("RecyclerTreeAdaptor can not attach to multi RecyclerView.");
        }
        this.f33755 = c17492;
    }

    @Override // l.AbstractC0414
    public final void onDetachedFromRecyclerView(C17492 c17492) {
        super.onDetachedFromRecyclerView(c17492);
        this.f33755 = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0061  */
    /* JADX WARN: Code duplicated, block: B:18:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae A[EDGE_INSN: B:66:0x00ae->B:31:0x00ae BREAK  A[LOOP:2: B:12:0x0046->B:30:0x00aa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0066 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24998(Collection collection) {
        ArrayList<C3534> arrayList;
        boolean z;
        C3534 c3534;
        boolean zM10396;
        String str;
        m24987();
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            int iLastIndexOf = str2.lastIndexOf(47);
            if (iLastIndexOf != -1) {
                hashSet.add(str2.substring(0, iLastIndexOf + 1));
            }
        }
        Iterator it2 = hashSet.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            arrayList = this.f33737;
            z = true;
            if (!zHasNext) {
                break;
            }
            String str3 = (String) it2.next();
            C3534 c3535 = null;
            while (true) {
                if (c3535 != null) {
                    if (str3.equals(c3535.f13022 + "/")) {
                        break;
                    }
                    c3534 = null;
                    for (C3534 c3536 : arrayList) {
                        zM10396 = c3536.m10396();
                        str = c3536.f13022;
                        if (!zM10396) {
                            if (!str3.startsWith(str + '/') && (c3534 == null || c3534.f13022.length() < str.length())) {
                                c3534 = c3536;
                            }
                        }
                    }
                    if (c3534 != null) {
                        break;
                    }
                    if (!c3534.m10413()) {
                        m24982(c3534, false, true);
                    }
                    arrayList = c3534.f13024;
                    c3535 = c3534;
                } else {
                    c3534 = null;
                    while (r3.hasNext()) {
                        zM10396 = c3536.m10396();
                        str = c3536.f13022;
                        if (!zM10396) {
                            if (!str3.startsWith(str + '/')) {
                            }
                        }
                    }
                    if (c3534 != null) {
                        break;
                        break;
                    }
                    if (!c3534.m10413()) {
                        m24982(c3534, false, true);
                    }
                    arrayList = c3534.f13024;
                    c3535 = c3534;
                }
            }
            if (c3535 != null) {
                arrayList2.add(c3535);
            }
        }
        HashSet hashSet2 = this.f33746;
        hashSet2.clear();
        int size = arrayList.size();
        for (final int i = 0; i < size; i++) {
            C3534 c3537 = (C3534) arrayList.get(i);
            boolean zM10397 = c3537.m10396();
            String str4 = c3537.f13022;
            if (zM10397 && collection.contains(str4)) {
                if (z) {
                    final C17492 c17492 = this.f33755;
                    if (c17492 != null) {
                        c17492.post(new Runnable() { // from class: l.᩶᩹᩺
                            @Override // java.lang.Runnable
                            public final void run() {
                                c17492.scrollToPosition(i);
                            }
                        });
                    }
                    z = false;
                }
                hashSet2.add(str4);
            }
        }
        ArrayList arrayList3 = this.f33744;
        if (z) {
            C9030.stream(arrayList2).mapToInt(new ToIntFunction() { // from class: l.֡᩹᩺
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    return this.f2984.f33737.indexOf((C3534) obj);
                }
            }).filter(new C16941()).min().ifPresent(new C12708(0, this));
        } else {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((C3534) it3.next()).m10405(false);
            }
        }
        this.f33749 = SystemClock.uptimeMillis();
        arrayList3.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24985(C9886 c9886, final int i) {
        final C17492 c17492 = c9886.f33755;
        if (c17492 != null) {
            c17492.post(new Runnable() { // from class: l.ܿ᩹᩺
                @Override // java.lang.Runnable
                public final void run() {
                    c17492.scrollToPosition(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] m24991() {
        m24987();
        if (!this.f33756) {
            return null;
        }
        C11018 c11018 = new C11018();
        if (this.f33747) {
            c11018.writeByte(81);
            c11018.m27786(this.f33753);
        } else {
            c11018.writeByte(82);
        }
        c11018.writeInt(m25012().size());
        Iterator it = m25012().iterator();
        while (it.hasNext()) {
            c11018.m27786((String) it.next());
        }
        return c11018.m27798();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25009(byte[] bArr) {
        m24987();
        if (bArr == null) {
            if (this.f33756) {
                mo24995();
                return;
            }
            return;
        }
        C17367 c17367M40441 = C17367.m40441(bArr);
        byte b = c17367M40441.readByte();
        if (b == 81) {
            this.f33756 = true;
            this.f33747 = true;
            this.f33753 = c17367M40441.m40458();
        } else if (b == 82) {
            this.f33756 = true;
        } else {
            throw new RuntimeException();
        }
        int i = c17367M40441.readInt();
        HashSet hashSet = new HashSet(i);
        for (int i2 = 0; i2 < i; i2++) {
            hashSet.add(c17367M40441.m40458());
        }
        this.f33748 = 0L;
        this.f33735 = null;
        this.f33739 = -2;
        m25000(new C20206(4, hashSet));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m25018(boolean z) {
        this.f33747 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo24995() {
        if (!this.f33756) {
            throw new IllegalStateException();
        }
        this.f33748 = System.currentTimeMillis();
        m24981((List) this.f33736.f44598);
        this.f33756 = false;
        this.f33744.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25000(InterfaceC2123 interfaceC2123) {
        if (!this.f33756) {
            throw new IllegalStateException();
        }
        LinkedList linkedList = new LinkedList();
        this.f33736.m33028(new C6357(this, interfaceC2123, linkedList));
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((C3534) it.next()).m10403(false);
        }
        m25017();
        this.f33744.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashSet m25012() {
        if (!this.f33756) {
            throw new IllegalStateException();
        }
        HashSet hashSet = new HashSet();
        this.f33736.m33027(hashSet);
        return hashSet;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m25021() {
        if (!this.f33756) {
            throw new IllegalStateException();
        }
        this.f33748 = System.currentTimeMillis();
        C13498 c13498 = this.f33736;
        c13498.m33029();
        LinkedList linkedList = new LinkedList();
        Iterator it = this.f33737.iterator();
        int i = 0;
        while (it.hasNext()) {
            C3534 c3534 = (C3534) it.next();
            if (c3534.m10396()) {
                if (c3534.m10409()) {
                    it.remove();
                    linkedList.addFirst(Integer.valueOf(i));
                }
            } else if (c3534.f13024.isEmpty()) {
                it.remove();
                linkedList.addFirst(Integer.valueOf(i));
            }
            i++;
        }
        m24981((List) c13498.f44598);
        int iMo14206 = mo14206();
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            notifyItemRemoved(((Integer) it2.next()).intValue() + iMo14206);
        }
        C17492 c17492 = this.f33755;
        if (c17492 != null) {
            c17492.postDelayed(new RunnableC17794(6, this), 300L);
        } else {
            this.f33756 = false;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m25023() {
        return this.f33756;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m25025() {
        if (!this.f33756) {
            throw new IllegalStateException();
        }
        return this.f33736.m33026();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m25019(C3534 c3534) {
        if (!mo25016(c3534.f13022)) {
            return false;
        }
        if (!this.f33747) {
            return true;
        }
        C3534 c3535 = c3534.f13020;
        return c3535 != null && C13638.equals(c3535.f13022, this.f33753) && c3534.m10396() && !c3534.m10399();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m25013() {
        m24987();
        if (this.f33756 || this.f33747) {
            throw new IllegalStateException();
        }
        this.f33752 = true;
        this.f33756 = true;
        this.f33735 = null;
        this.f33739 = -2;
        m25000(new C12441(12));
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m25022() {
        m24987();
        if (this.f33756 || this.f33747) {
            throw new IllegalStateException();
        }
        this.f33748 = System.currentTimeMillis();
        this.f33756 = true;
        this.f33735 = null;
        this.f33739 = -2;
        m25000(new C0252(5));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m24990(C3534 c3534) {
        m24987();
        if (this.f33756) {
            throw new IllegalStateException();
        }
        if (!mo25016(c3534.f13022)) {
            throw new IllegalStateException();
        }
        this.f33748 = System.currentTimeMillis();
        this.f33756 = true;
        this.f33735 = null;
        this.f33739 = -2;
        if (this.f33747) {
            this.f33753 = c3534.f13020.f13022;
        }
        if (c3534.m10396()) {
            c3534.m10412(true);
        } else {
            c3534.m10410();
            C10592.m26769(c3534.f13024);
            c3534.m10403(true);
        }
        this.f33744.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m25017() {
        if (this.f33752) {
            return;
        }
        Iterator it = this.f33736.f44598.iterator();
        while (it.hasNext()) {
            if (((C3534) it.next()).m10407() != 0) {
                return;
            }
        }
        mo24995();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25006(C9181 c9181) {
        C3534 c3534 = c9181.f17534;
        if (!m25019(c3534)) {
            throw new IllegalArgumentException();
        }
        this.f33735 = null;
        c3534.m10412(!c3534.m10409());
        if (c3534.m10409()) {
            int iIndexOf = this.f33737.indexOf(c3534);
            int iAbs = Math.abs(iIndexOf - this.f33739);
            this.f33739 = iIndexOf;
            if (iAbs == 1) {
                this.f33754++;
            } else {
                this.f33754 = 1;
            }
            if (this.f33754 == 5) {
                C15829.m37618(R.string.MT_Protector);
                this.f33754 = 0;
            }
        } else {
            m25017();
            this.f33739 = -2;
        }
        C24018 c24018 = c9181.f17536;
        boolean zM10409 = c3534.m10409();
        c24018.getClass();
        c24018.m52854(zM10409 ? 2 : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25003(AbstractViewOnClickListenerC5030 abstractViewOnClickListenerC5030) {
        C3534 c3534 = abstractViewOnClickListenerC5030.f17534;
        if (!this.f33756) {
            throw new IllegalStateException();
        }
        if (!m25019(c3534)) {
            throw new IllegalArgumentException();
        }
        C3534 c3535 = this.f33735;
        if (c3535 == null) {
            this.f33735 = c3534;
            if (c3534.m10396()) {
                this.f33735.m10412(true);
                C24018 c24018 = abstractViewOnClickListenerC5030.f17536;
                c24018.getClass();
                c24018.m52854(2);
                return;
            }
            ((C10592) abstractViewOnClickListenerC5030).mo26770(2);
            this.f33735 = c3534;
            return;
        }
        this.f33735 = null;
        if (c3535.equals(c3534)) {
            return;
        }
        C11297 c11297 = new C11297(c3535, c3534);
        C13498 c13498 = this.f33736;
        c13498.m33028(c11297);
        LinkedList linkedList = new LinkedList();
        c13498.m33028(new C23997(linkedList));
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((C3534) it.next()).m10403(false);
        }
        m25017();
        this.f33744.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24981(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3534 c3534 = (C3534) it.next();
            c3534.m10400();
            if (!c3534.m10396()) {
                m24981((List) c3534.f13024);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24984(C9886 c9886) {
        c9886.f33756 = false;
        for (C24018 c24018 : c9886.f33751) {
            c24018.getClass();
            c24018.m52854(0);
            int i = C5031.f17539;
            if (c24018.isAttachedToWindow()) {
                ObjectAnimator.ofFloat(c24018, "scaleX", 1.0f, 0.0f).setDuration(200L).start();
            } else {
                c24018.setScaleX(0.0f);
            }
        }
    }

    @Override // l.AbstractC0414
    public int getItemViewType(int i) {
        C3534 c3534 = (C3534) this.f33737.get(i);
        if (c3534.m10396()) {
            return (mo14208() && c3534.m10399()) ? 10002 : 10000;
        }
        return IShizukuApplication.Stub.TRANSACTION_showPermissionConfirmation;
    }

    @Override // l.AbstractC0414
    public AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Set set = this.f33751;
        switch (i) {
            case 10000:
                C9181 c9181 = new C9181(this, C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false));
                c9181.f31244 = (ImageView) c9181.itemView.findViewById(R.id.icon);
                c9181.f31246 = (TextView) c9181.itemView.findViewById(R.id.textView);
                c9181.f31245 = c9181.itemView.findViewById(R.id.MT_Protector);
                C24018 c24018 = (C24018) c9181.itemView.findViewById(R.id.MT_Protector);
                c9181.f17536 = c24018;
                c24018.setClickable(false);
                set.add(c9181.f17536);
                return c9181;
            case IShizukuApplication.Stub.TRANSACTION_showPermissionConfirmation /* 10001 */:
                C10592 c10592 = new C10592(this, C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false));
                c10592.f36239 = (ImageView) c10592.itemView.findViewById(R.id.icon);
                c10592.f36241 = (TextView) c10592.itemView.findViewById(R.id.textView);
                ImageView imageView = (ImageView) c10592.itemView.findViewById(R.id.MT_Protector);
                c10592.f36240 = imageView;
                imageView.setImageResource(R.drawable.MT_Protector);
                C24018 c24019 = (C24018) c10592.itemView.findViewById(R.id.MT_Protector);
                c10592.f17536 = c24019;
                c24019.m52855(c10592);
                set.add(c10592.f17536);
                return c10592;
            case 10002:
                return mo14203(viewGroup);
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo14202(int i) {
        return (this.f33750 * i) + this.f33741;
    }

    @Override // l.AbstractC0414
    public void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        C3534 c3534 = (C3534) this.f33737.get(i);
        boolean zM10399 = c3534.m10399();
        String str = c3534.f13025;
        String str2 = c3534.f13022;
        if (zM10399) {
            mo14204(abstractC12554, c3534.f13020.f13022, c3534.m10397());
            return;
        }
        AbstractViewOnClickListenerC5030 abstractViewOnClickListenerC5030 = (AbstractViewOnClickListenerC5030) abstractC12554;
        abstractViewOnClickListenerC5030.f17534 = c3534;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) abstractViewOnClickListenerC5030.itemView.getLayoutParams();
        if (c3534.m10396()) {
            marginLayoutParams.leftMargin = mo14202(c3534.m10404());
            C9181 c9181 = (C9181) abstractViewOnClickListenerC5030;
            ImageView imageView = c9181.f31244;
            TextView textView = c9181.f31246;
            textView.setText(mo24993(str2, C13012.m32189(200, str), true));
            imageView.setImageDrawable(this.f33743);
            if (this.f33746.remove(str2)) {
                this.f33744.add(c3534);
                c3534.m10405(true);
                if (SystemClock.uptimeMillis() - this.f33749 < 2000) {
                    C19764 c19764 = new C19764(C20368.f65992);
                    c19764.m44952(1200);
                    View view = c9181.f31245;
                    int i2 = C5031.f17539;
                    view.setBackground(c19764);
                }
            }
            if (c3534.m10406()) {
                textView.setTextColor(C20368.f65973);
            } else {
                textView.setTextColor(C20368.f65976);
            }
            InterfaceC2207 interfaceC2207 = this.f33740;
            if (interfaceC2207 != null) {
                interfaceC2207.mo6817(str2, imageView, textView);
            }
        } else {
            marginLayoutParams.leftMargin = this.f33750 * c3534.m10404();
            C10592 c10592 = (C10592) abstractViewOnClickListenerC5030;
            c10592.f36241.setText(mo24993(str2, C13012.m32189(200, str), false));
            c10592.f36239.setImageDrawable(this.f33745);
            c10592.f36240.setRotation(c3534.m10413() ? 135.0f : 90.0f);
        }
        c3534.m10402(abstractViewOnClickListenerC5030.f17536);
        if (System.currentTimeMillis() - this.f33748 < 100) {
            if (!m25019(c3534)) {
                C24018 c24018 = abstractViewOnClickListenerC5030.f17536;
                c24018.getClass();
                c24018.setVisibility(8);
            } else {
                C24018 c24019 = abstractViewOnClickListenerC5030.f17536;
                c24019.getClass();
                c24019.setVisibility(0);
                if (this.f33756) {
                    ObjectAnimator.ofFloat(abstractViewOnClickListenerC5030.f17536, "scaleX", 0.01f, 1.0f).setDuration(200L).start();
                } else {
                    ObjectAnimator.ofFloat(abstractViewOnClickListenerC5030.f17536, "scaleX", 1.0f, 0.0f).setDuration(200L).start();
                }
            }
        } else {
            abstractViewOnClickListenerC5030.f17536.setScaleX(1.0f);
            C24018 c240110 = abstractViewOnClickListenerC5030.f17536;
            boolean z = this.f33756 && m25019(c3534);
            c240110.getClass();
            c240110.setVisibility(z ? 0 : 8);
        }
        abstractViewOnClickListenerC5030.itemView.setLayoutParams(marginLayoutParams);
    }

    @Override // l.AbstractC0414
    public int getItemCount() {
        return this.f33737.size();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m24987() {
        if (mo14208()) {
            throw new RuntimeException("Unsupported in left extra mode.");
        }
    }

    /* JADX INFO: renamed from: ܰ */
    public int mo14207(String str) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC12554 mo14203(ViewGroup viewGroup) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo14204(AbstractC12554 abstractC12554, String str, int i) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m25020() {
        C3534 c3534;
        C13115 c13115 = (C13115) this.f33755.getLayoutManager();
        C13638.requireNonNull(c13115);
        int iFindFirstVisibleItemPosition = c13115.findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || (c3534 = ((C3534) this.f33737.get(iFindFirstVisibleItemPosition)).f13020) == null) {
            return null;
        }
        return m24988(c3534);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m24988(C3534 c3534) {
        C3534 c3535 = c3534.f13020;
        String str = c3534.f13025;
        if (c3535 == null) {
            return str;
        }
        return m24988(c3534.f13020) + "/" + str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC6909 m24994(C10578 c10578) {
        return new C14825(this, c10578);
    }
}
