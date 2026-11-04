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
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import moe.shizuku.server.IShizukuApplication;

/* JADX INFO: renamed from: l.ܰ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes5.dex */
public class C14941 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final C24720 f48783 = C24720.m55198();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f48784;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Drawable f48785;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19417 f48786;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f48787;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f48788;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public long f48789;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f48790;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f48791;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public ArrayList f48792;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f48793;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Drawable f48794;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public HashSet f48795;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C0772 f48796;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f48797;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Set f48798;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C25227 f48799;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C21655 f48800;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f48801;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC2264 f48802;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f48803;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public long f48804;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC5993 f48805;

    /* JADX INFO: renamed from: ۙ */
    public CharSequence mo32793(String str, String str2, boolean z) {
        return str2;
    }

    /* JADX INFO: renamed from: ۚ */
    public int mo28663() {
        return 0;
    }

    /* JADX INFO: renamed from: ۤ */
    public boolean mo32795(String str) {
        return true;
    }

    /* JADX INFO: renamed from: ܶ */
    public boolean mo35319() {
        return false;
    }

    public C14941() {
        this(m35934("C"));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Drawable[] m35934(String str) {
        AbstractC23597 abstractC23597 = C20613.f66106;
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        if (C3296.f10755) {
            paint.setShadowLayer(2.5f, 1.0f, 1.0f, 1342177280);
        }
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(Typeface.MONOSPACE);
        paint2.setTextSize(C6907.m19161(14 - str.length()));
        int iM19160 = C6907.m19160(25.0f);
        int iM19161 = C6907.m19160(12.5f);
        int iM19162 = C6907.m19160(11.0f);
        int iM19163 = C6907.m19160(5.0f);
        int iM19164 = C6907.m19160(2.0f);
        paint2.setColor(abstractC23597.mo36860());
        paint2.setAlpha(C3296.m10871(200, 255));
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        float f3 = iM19161;
        float f4 = (f3 - f2) - ((f - f2) / 2.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM19160, iM19160, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        paint.setColor(abstractC23597.mo36859());
        canvas.drawCircle(f3, f3, iM19162, paint);
        canvas.drawText(str, f3, f4, paint2);
        C4325 c4325 = new C4325();
        c4325.f15672 = iM19160;
        c4325.f15673 = iM19161;
        c4325.f15677 = iM19164;
        c4325.f15675 = iM19163;
        c4325.f15674 = null;
        return new Drawable[]{new BitmapDrawable(bitmapCreateBitmap), new BitmapDrawable(RunnableC21479.m48867(c4325, C20613.f66104, R.drawable.MT_Protector))};
    }

    public C14941(Drawable[] drawableArr) {
        this.f48787 = C6907.m19160(25.0f);
        this.f48788 = C6907.m19160(17.0f);
        this.f48784 = false;
        this.f48793 = false;
        this.f48792 = new ArrayList();
        C0772 c0772 = new C0772();
        c0772.f2791 = new ArrayList();
        this.f48796 = c0772;
        this.f48795 = new HashSet();
        this.f48790 = new ArrayList();
        this.f48798 = Collections.newSetFromMap(new WeakHashMap());
        this.f48794 = drawableArr[0];
        this.f48785 = drawableArr[1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35938(int i, Collection collection) {
        C15306 c15306M36752 = C15306.m36752(collection);
        c15306M36752.m36757(i);
        m35948(c15306M36752.m36756());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35948(C19782 c19782) {
        C0772 c0772 = this.f48796;
        ArrayList arrayList = c0772.f2791;
        ArrayList arrayList2 = c0772.f2791;
        arrayList.clear();
        for (C19782 c19783 : c19782.m45556()) {
            C21655 c21655 = new C21655(c19783, (C21655) null);
            arrayList2.add(c21655);
            m35929(c19783, c21655);
        }
        Iterator it = c19782.m45561().iterator();
        while (it.hasNext()) {
            arrayList2.add(new C21655((C22020) it.next(), (C21655) null));
        }
        ArrayList arrayList3 = this.f48792;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        this.f48790.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35929(C19782 c19782, C21655 c21655) {
        ArrayList arrayList = c21655.f69129;
        for (C19782 c19783 : c19782.m45556()) {
            C21655 c21656 = new C21655(c19783, c21655);
            arrayList.add(c21656);
            m35929(c19783, c21656);
        }
        Iterator it = c19782.m45561().iterator();
        while (it.hasNext()) {
            arrayList.add(new C21655((C22020) it.next(), c21655));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0772 m35935() {
        return this.f48796;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m35953() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f48792;
            if (i < arrayList.size()) {
                C21655 c21655 = (C21655) arrayList.get(i);
                if (c21655.m49187()) {
                    int i2 = i + 1;
                    int iM35933 = m35933(c21655);
                    if (iM35933 > 0) {
                        arrayList.subList(i2, iM35933 + i2).clear();
                    }
                }
                i++;
            } else {
                this.f48790.clear();
                notifyDataSetChanged();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35950(boolean z) {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.f48792;
            if (i >= arrayList.size()) {
                break;
            }
            C21655 c21655 = (C21655) arrayList.get(i);
            if (!c21655.m49186() && !c21655.m49187()) {
                m35930(c21655, false, z);
            }
            i++;
        }
        if (z && mo35319()) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C21655 c21656 = (C21655) arrayList.get(i2);
                if (c21656.m49186() && !c21656.m49177() && !c21656.m49187()) {
                    m35930(c21656, false, z);
                }
            }
        }
        this.f48790.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m35960() {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.f48792;
            if (i >= arrayList.size()) {
                break;
            }
            C21655 c21655 = (C21655) arrayList.get(i);
            if (!c21655.m49186() && !c21655.m49187()) {
                m35930(c21655, false, true);
                if (arrayList.size() >= 200) {
                    break;
                }
            }
            i++;
        }
        if (mo35319()) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C21655 c21656 = (C21655) arrayList.get(i2);
                if (c21656.m49186() && !c21656.m49177() && !c21656.m49187()) {
                    m35930(c21656, false, true);
                    if (arrayList.size() >= 200) {
                        break;
                    }
                }
            }
        }
        this.f48790.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashSet m35957() {
        HashSet hashSet = new HashSet();
        for (C21655 c21655 : this.f48792) {
            boolean zM49187 = c21655.m49187();
            String str = c21655.f69128;
            if (zM49187) {
                if (c21655.m49186()) {
                    hashSet.add(str);
                } else {
                    hashSet.add(str + "/");
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35941(HashSet hashSet) {
        this.f48792.clear();
        m35925(hashSet, (C21655) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35925(HashSet hashSet, C21655 c21655) {
        for (C21655 c21656 : c21655 == null ? this.f48796.f2791 : c21655.f69129) {
            ArrayList arrayList = this.f48792;
            arrayList.add(c21656);
            boolean zM49186 = c21656.m49186();
            String str = c21656.f69128;
            if (!zM49186) {
                boolean zContains = hashSet.contains(str + "/");
                c21656.m49184(zContains);
                if (zContains) {
                    m35925(hashSet, c21656);
                }
            } else if (mo35319()) {
                boolean zContains2 = hashSet.contains(str);
                c21656.m49184(zContains2);
                if (zContains2) {
                    int iMo35320 = mo35320(str);
                    c21656.m49179(iMo35320);
                    for (int i = 0; i < iMo35320; i++) {
                        arrayList.add(new C21655(i, c21656));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m35954(C21655 c21655) {
        ArrayList arrayList = this.f48792;
        int iIndexOf = arrayList.indexOf(c21655);
        if (iIndexOf == -1) {
            return;
        }
        int i = iIndexOf + 1;
        int iM35933 = m35933(c21655);
        if (iM35933 > 0) {
            arrayList.subList(i, i + iM35933).clear();
            notifyItemRangeRemoved(mo28663() + i, iM35933);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private int m35933(C21655 c21655) {
        int iM49193;
        if (!c21655.m49187()) {
            return 0;
        }
        if (c21655.m49186()) {
            if (!mo35319() || c21655.m49177()) {
                throw new RuntimeException();
            }
            iM49193 = c21655.m49193();
        } else {
            Iterator it = c21655.f69129.iterator();
            int iM35933 = 0;
            while (it.hasNext()) {
                iM35933 += m35933((C21655) it.next()) + 1;
            }
            iM49193 = iM35933;
        }
        c21655.m49184(false);
        return iM49193;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35949(C21655 c21655) {
        m35930(c21655, true, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35930(C21655 c21655, boolean z, boolean z2) {
        int i;
        ArrayList arrayList = this.f48792;
        int iIndexOf = arrayList.indexOf(c21655);
        if (iIndexOf == -1) {
            return;
        }
        int i2 = iIndexOf + 1;
        c21655.m49184(true);
        ArrayList<C21655> arrayList2 = c21655.f69129;
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C21655 c21656 = (C21655) it.next();
            c21656.m49184(false);
            c21656.m49189(false);
        }
        if (z2 && mo35319()) {
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            if (c21655.m49186()) {
                if (c21655.m49177()) {
                    throw new RuntimeException();
                }
                int iMo35320 = mo35320(c21655.f69128);
                c21655.m49179(iMo35320);
                for (i = 0; i < iMo35320; i++) {
                    arrayList3.add(new C21655(i, c21655));
                }
            } else {
                for (C21655 c21657 : arrayList2) {
                    arrayList3.add(c21657);
                    if (c21657.m49186()) {
                        c21657.m49184(true);
                        int iMo35321 = mo35320(c21657.f69128);
                        c21657.m49179(iMo35321);
                        for (int i3 = 0; i3 < iMo35321; i3++) {
                            arrayList3.add(new C21655(i3, c21657));
                        }
                    }
                }
            }
            arrayList2 = arrayList3;
        } else if (c21655.m49186()) {
            throw new RuntimeException();
        }
        arrayList.addAll(i2, arrayList2);
        if (z) {
            notifyItemRangeInserted(mo28663() + i2, arrayList2.size());
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList m35956() {
        return this.f48792;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35944(InterfaceC5993 interfaceC5993) {
        this.f48805 = interfaceC5993;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35942(InterfaceC2264 interfaceC2264) {
        this.f48802 = interfaceC2264;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35947(InterfaceC19417 interfaceC19417) {
        this.f48786 = interfaceC19417;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35952(View view, C21655 c21655, AbstractViewOnClickListenerC10466 abstractViewOnClickListenerC10466) {
        InterfaceC5993 interfaceC5993 = this.f48805;
        if (c21655 == null || interfaceC5993 == null) {
            return false;
        }
        return interfaceC5993.mo12934(new C8230(this, abstractViewOnClickListenerC10466, view));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35939(View view, C21655 c21655, C15687 c15687) {
        if (mo35319() && mo35320(c21655.f69128) > 0) {
            if (!c21655.m49187()) {
                m35930(c21655, true, true);
                return;
            } else {
                m35954(c21655);
                return;
            }
        }
        InterfaceC2264 interfaceC2264 = this.f48802;
        if (c21655 == null || interfaceC2264 == null) {
            return;
        }
        if (!c21655.m49186()) {
            throw new RuntimeException();
        }
        interfaceC2264.mo7690(new C8230(this, c15687, view));
    }

    @Override // l.AbstractC12964
    public final void onAttachedToRecyclerView(C25227 c25227) {
        super.onAttachedToRecyclerView(c25227);
        C25227 c25228 = this.f48799;
        if (c25228 != null && c25228 != c25227) {
            throw new RuntimeException("RecyclerTreeAdaptor can not attach to multi RecyclerView.");
        }
        this.f48799 = c25227;
    }

    @Override // l.AbstractC12964
    public final void onDetachedFromRecyclerView(C25227 c25227) {
        super.onDetachedFromRecyclerView(c25227);
        this.f48799 = null;
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
    public final void m35940(Collection collection) {
        ArrayList<C21655> arrayList;
        boolean z;
        C21655 c21655;
        boolean zM49186;
        String str;
        m35931();
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
            arrayList = this.f48792;
            z = true;
            if (!zHasNext) {
                break;
            }
            String str3 = (String) it2.next();
            C21655 c21656 = null;
            while (true) {
                if (c21656 != null) {
                    if (str3.equals(c21656.f69128 + "/")) {
                        break;
                    }
                    c21655 = null;
                    for (C21655 c21657 : arrayList) {
                        zM49186 = c21657.m49186();
                        str = c21657.f69128;
                        if (!zM49186) {
                            if (!str3.startsWith(str + '/') && (c21655 == null || c21655.f69128.length() < str.length())) {
                                c21655 = c21657;
                            }
                        }
                    }
                    if (c21655 != null) {
                        break;
                    }
                    if (!c21655.m49187()) {
                        m35930(c21655, false, true);
                    }
                    arrayList = c21655.f69129;
                    c21656 = c21655;
                } else {
                    c21655 = null;
                    while (r3.hasNext()) {
                        zM49186 = c21657.m49186();
                        str = c21657.f69128;
                        if (!zM49186) {
                            if (!str3.startsWith(str + '/')) {
                            }
                        }
                    }
                    if (c21655 != null) {
                        break;
                        break;
                    }
                    if (!c21655.m49187()) {
                        m35930(c21655, false, true);
                    }
                    arrayList = c21655.f69129;
                    c21656 = c21655;
                }
            }
            if (c21656 != null) {
                arrayList2.add(c21656);
            }
        }
        HashSet hashSet2 = this.f48795;
        hashSet2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C21655 c21658 = (C21655) arrayList.get(i);
            boolean zM49187 = c21658.m49186();
            String str4 = c21658.f69128;
            if (zM49187 && collection.contains(str4)) {
                if (z) {
                    C25227 c25227 = this.f48799;
                    if (c25227 != null) {
                        c25227.post(new RunnableC25385(i, 0, c25227));
                    }
                    z = false;
                }
                hashSet2.add(str4);
            }
        }
        ArrayList arrayList3 = this.f48790;
        if (z) {
            C1170.stream(arrayList2).mapToInt(new ToIntFunction() { // from class: l.ܺ᩺᩻
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    return this.f55993.f48792.indexOf((C21655) obj);
                }
            }).filter(new C17925()).min().ifPresent(new IntConsumer() { // from class: l.ܶ᩺᩻
                @Override // java.util.function.IntConsumer
                public final void accept(int i2) {
                    C14941.m35928(this.f53315, i2);
                }

                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return C4109.$default$andThen(this, intConsumer);
                }
            });
        } else {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((C21655) it3.next()).m49189(false);
            }
        }
        this.f48804 = SystemClock.uptimeMillis();
        arrayList3.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m35928(C14941 c14941, final int i) {
        final C25227 c25227 = c14941.f48799;
        if (c25227 != null) {
            c25227.post(new Runnable() { // from class: l.᩹᩺᩻
                @Override // java.lang.Runnable
                public final void run() {
                    c25227.scrollToPosition(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] m35966() {
        m35931();
        if (!this.f48793) {
            return null;
        }
        C6178 c6178 = new C6178();
        if (this.f48791) {
            c6178.writeByte(81);
            c6178.m17800(this.f48801);
        } else {
            c6178.writeByte(82);
        }
        c6178.writeInt(m35955().size());
        Iterator it = m35955().iterator();
        while (it.hasNext()) {
            c6178.m17800((String) it.next());
        }
        return c6178.m17799();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35951(byte[] bArr) {
        m35931();
        if (bArr == null) {
            if (this.f48793) {
                mo32794();
                return;
            }
            return;
        }
        C20348 c20348M46740 = C20348.m46740(bArr);
        byte b = c20348M46740.readByte();
        if (b == 81) {
            this.f48793 = true;
            this.f48791 = true;
            this.f48801 = c20348M46740.m46758();
        } else if (b == 82) {
            this.f48793 = true;
        } else {
            throw new RuntimeException();
        }
        int i = c20348M46740.readInt();
        HashSet hashSet = new HashSet(i);
        for (int i2 = 0; i2 < i; i2++) {
            hashSet.add(c20348M46740.m46758());
        }
        this.f48789 = 0L;
        this.f48800 = null;
        this.f48797 = -2;
        m35943(new C3755(hashSet));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m35963(boolean z) {
        this.f48791 = z;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo32794() {
        if (!this.f48793) {
            throw new IllegalStateException();
        }
        this.f48789 = System.currentTimeMillis();
        m35926((List) this.f48796.f2791);
        this.f48793 = false;
        this.f48790.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35943(InterfaceC4501 interfaceC4501) {
        if (!this.f48793) {
            throw new IllegalStateException();
        }
        LinkedList linkedList = new LinkedList();
        this.f48796.m3153(new C20909(this, interfaceC4501, linkedList));
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((C21655) it.next()).m49181(false);
        }
        m35962();
        this.f48790.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet m35955() {
        if (!this.f48793) {
            throw new IllegalStateException();
        }
        HashSet hashSet = new HashSet();
        this.f48796.m3152(hashSet);
        return hashSet;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m35959() {
        return this.f48793;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m35967() {
        if (!this.f48793) {
            throw new IllegalStateException();
        }
        this.f48789 = System.currentTimeMillis();
        C0772 c0772 = this.f48796;
        c0772.m3154();
        LinkedList linkedList = new LinkedList();
        Iterator it = this.f48792.iterator();
        int i = 0;
        while (it.hasNext()) {
            C21655 c21655 = (C21655) it.next();
            if (c21655.m49186()) {
                if (c21655.m49182()) {
                    it.remove();
                    linkedList.addFirst(Integer.valueOf(i));
                }
            } else if (c21655.f69129.isEmpty()) {
                it.remove();
                linkedList.addFirst(Integer.valueOf(i));
            }
            i++;
        }
        m35926((List) c0772.f2791);
        int iMo28663 = mo28663();
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            notifyItemRemoved(((Integer) it2.next()).intValue() + iMo28663);
        }
        C25227 c25227 = this.f48799;
        if (c25227 != null) {
            c25227.postDelayed(new RunnableC4839(3, this), 300L);
        } else {
            this.f48793 = false;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m35968() {
        if (!this.f48793) {
            throw new IllegalStateException();
        }
        return this.f48796.m3151();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m35964(C21655 c21655) {
        if (!mo32795(c21655.f69128)) {
            return false;
        }
        if (!this.f48791) {
            return true;
        }
        C21655 c21656 = c21655.f69130;
        return c21656 != null && C17359.equals(c21656.f69128, this.f48801) && c21655.m49186() && !c21655.m49177();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m35936() {
        m35931();
        if (this.f48793 || this.f48791) {
            throw new IllegalStateException();
        }
        this.f48784 = true;
        this.f48793 = true;
        this.f48800 = null;
        this.f48797 = -2;
        m35943(new C13645());
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m35961() {
        m35931();
        if (this.f48793 || this.f48791) {
            throw new IllegalStateException();
        }
        this.f48789 = System.currentTimeMillis();
        this.f48793 = true;
        this.f48800 = null;
        this.f48797 = -2;
        m35943(new C16076());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m35965(C21655 c21655) {
        m35931();
        if (this.f48793) {
            throw new IllegalStateException();
        }
        if (!mo32795(c21655.f69128)) {
            throw new IllegalStateException();
        }
        this.f48789 = System.currentTimeMillis();
        this.f48793 = true;
        this.f48800 = null;
        this.f48797 = -2;
        if (this.f48791) {
            this.f48801 = c21655.f69130.f69128;
        }
        if (c21655.m49186()) {
            c21655.m49192(true);
        } else {
            c21655.m49190();
            C13450.m33092(c21655.f69129);
            c21655.m49181(true);
        }
        this.f48790.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m35962() {
        if (this.f48784) {
            return;
        }
        Iterator it = this.f48796.f2791.iterator();
        while (it.hasNext()) {
            if (((C21655) it.next()).m49183() != 0) {
                return;
            }
        }
        mo32794();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35946(C15687 c15687) {
        C21655 c21655 = c15687.f33309;
        if (!m35964(c21655)) {
            throw new IllegalArgumentException();
        }
        this.f48800 = null;
        c21655.m49192(!c21655.m49182());
        if (c21655.m49182()) {
            int iIndexOf = this.f48792.indexOf(c21655);
            int iAbs = Math.abs(iIndexOf - this.f48797);
            this.f48797 = iIndexOf;
            if (iAbs == 1) {
                this.f48803++;
            } else {
                this.f48803 = 1;
            }
            if (this.f48803 == 5) {
                C22673.m51159(R.string.MT_Protector);
                this.f48803 = 0;
            }
        } else {
            m35962();
            this.f48797 = -2;
        }
        C14240 c14240 = c15687.f33310;
        boolean zM49182 = c21655.m49182();
        c14240.getClass();
        c14240.m34563(zM49182 ? 2 : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35945(AbstractViewOnClickListenerC10466 abstractViewOnClickListenerC10466) {
        C21655 c21655 = abstractViewOnClickListenerC10466.f33309;
        if (!this.f48793) {
            throw new IllegalStateException();
        }
        if (!m35964(c21655)) {
            throw new IllegalArgumentException();
        }
        C21655 c21656 = this.f48800;
        if (c21656 == null) {
            this.f48800 = c21655;
            if (c21655.m49186()) {
                this.f48800.m49192(true);
                C14240 c14240 = abstractViewOnClickListenerC10466.f33310;
                c14240.getClass();
                c14240.m34563(2);
                return;
            }
            ((C13450) abstractViewOnClickListenerC10466).mo12333(2);
            this.f48800 = c21655;
            return;
        }
        this.f48800 = null;
        if (c21656.equals(c21655)) {
            return;
        }
        C12704 c12704 = new C12704(c21656, c21655);
        C0772 c0772 = this.f48796;
        c0772.m3153(c12704);
        LinkedList linkedList = new LinkedList();
        c0772.m3153(new C6739(linkedList));
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((C21655) it.next()).m49181(false);
        }
        m35962();
        this.f48790.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35926(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21655 c21655 = (C21655) it.next();
            c21655.m49178();
            if (!c21655.m49186()) {
                m35926((List) c21655.f69129);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35927(C14941 c14941) {
        c14941.f48793 = false;
        for (C14240 c14240 : c14941.f48798) {
            c14240.getClass();
            c14240.m34563(0);
            int i = C22666.f73603;
            if (c14240.isAttachedToWindow()) {
                ObjectAnimator.ofFloat(c14240, "scaleX", 1.0f, 0.0f).setDuration(200L).start();
            } else {
                c14240.setScaleX(0.0f);
            }
        }
    }

    @Override // l.AbstractC12964
    public int getItemViewType(int i) {
        C21655 c21655 = (C21655) this.f48792.get(i);
        if (c21655.m49186()) {
            return (mo35319() && c21655.m49177()) ? 10002 : 10000;
        }
        return IShizukuApplication.Stub.TRANSACTION_showPermissionConfirmation;
    }

    @Override // l.AbstractC12964
    public AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Set set = this.f48798;
        switch (i) {
            case 10000:
                C15687 c15687 = new C15687(this, C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false));
                c15687.f50997 = (ImageView) c15687.itemView.findViewById(R.id.icon);
                c15687.f50998 = (TextView) c15687.itemView.findViewById(R.id.textView);
                c15687.f50996 = c15687.itemView.findViewById(R.id.MT_Protector);
                C14240 c14240 = (C14240) c15687.itemView.findViewById(R.id.MT_Protector);
                c15687.f33310 = c14240;
                c14240.setClickable(false);
                set.add(c15687.f33310);
                return c15687;
            case IShizukuApplication.Stub.TRANSACTION_showPermissionConfirmation /* 10001 */:
                C13450 c13450 = new C13450(this, C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false));
                c13450.f42825 = (ImageView) c13450.itemView.findViewById(R.id.icon);
                c13450.f42826 = (TextView) c13450.itemView.findViewById(R.id.textView);
                ImageView imageView = (ImageView) c13450.itemView.findViewById(R.id.MT_Protector);
                c13450.f42824 = imageView;
                imageView.setImageResource(R.drawable.MT_Protector);
                C14240 c14241 = (C14240) c13450.itemView.findViewById(R.id.MT_Protector);
                c13450.f33310 = c14241;
                c14241.m34564(c13450);
                set.add(c13450.f33310);
                return c13450;
            case 10002:
                return mo35315(viewGroup);
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo35314(int i) {
        return (this.f48787 * i) + this.f48788;
    }

    @Override // l.AbstractC12964
    public void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        C21655 c21655 = (C21655) this.f48792.get(i);
        boolean zM49177 = c21655.m49177();
        String str = c21655.f69127;
        String str2 = c21655.f69128;
        if (zM49177) {
            mo35317(abstractC11800, c21655.f69130.f69128, c21655.m49193());
            return;
        }
        AbstractViewOnClickListenerC10466 abstractViewOnClickListenerC10466 = (AbstractViewOnClickListenerC10466) abstractC11800;
        abstractViewOnClickListenerC10466.f33309 = c21655;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) abstractViewOnClickListenerC10466.itemView.getLayoutParams();
        if (c21655.m49186()) {
            marginLayoutParams.leftMargin = mo35314(c21655.m49188());
            C15687 c15687 = (C15687) abstractViewOnClickListenerC10466;
            ImageView imageView = c15687.f50997;
            TextView textView = c15687.f50998;
            textView.setText(mo32793(str2, C18969.m44060(200, str), true));
            imageView.setImageDrawable(this.f48794);
            if (this.f48795.remove(str2)) {
                this.f48790.add(c21655);
                c21655.m49189(true);
                if (SystemClock.uptimeMillis() - this.f48804 < 2000) {
                    C20163 c20163 = new C20163(C3296.f10761);
                    c20163.m46374(1200);
                    View view = c15687.f50996;
                    int i2 = C22666.f73603;
                    view.setBackground(c20163);
                }
            }
            if (c21655.m49185()) {
                textView.setTextColor(C3296.f10768);
            } else {
                textView.setTextColor(C3296.f10751);
            }
            InterfaceC19417 interfaceC19417 = this.f48786;
            if (interfaceC19417 != null) {
                interfaceC19417.mo35316(str2, imageView, textView);
            }
        } else {
            marginLayoutParams.leftMargin = this.f48787 * c21655.m49188();
            C13450 c13450 = (C13450) abstractViewOnClickListenerC10466;
            c13450.f42826.setText(mo32793(str2, C18969.m44060(200, str), false));
            c13450.f42825.setImageDrawable(this.f48785);
            c13450.f42824.setRotation(c21655.m49187() ? 135.0f : 90.0f);
        }
        c21655.m49180(abstractViewOnClickListenerC10466.f33310);
        if (System.currentTimeMillis() - this.f48789 < 100) {
            if (!m35964(c21655)) {
                C14240 c14240 = abstractViewOnClickListenerC10466.f33310;
                c14240.getClass();
                c14240.setVisibility(8);
            } else {
                C14240 c14241 = abstractViewOnClickListenerC10466.f33310;
                c14241.getClass();
                c14241.setVisibility(0);
                if (this.f48793) {
                    ObjectAnimator.ofFloat(abstractViewOnClickListenerC10466.f33310, "scaleX", 0.01f, 1.0f).setDuration(200L).start();
                } else {
                    ObjectAnimator.ofFloat(abstractViewOnClickListenerC10466.f33310, "scaleX", 1.0f, 0.0f).setDuration(200L).start();
                }
            }
        } else {
            abstractViewOnClickListenerC10466.f33310.setScaleX(1.0f);
            C14240 c14242 = abstractViewOnClickListenerC10466.f33310;
            boolean z = this.f48793 && m35964(c21655);
            c14242.getClass();
            c14242.setVisibility(z ? 0 : 8);
        }
        abstractViewOnClickListenerC10466.itemView.setLayoutParams(marginLayoutParams);
    }

    @Override // l.AbstractC12964
    public int getItemCount() {
        return this.f48792.size();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m35931() {
        if (mo35319()) {
            throw new RuntimeException("Unsupported in left extra mode.");
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public int mo35320(String str) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC11800 mo35315(ViewGroup viewGroup) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo35317(AbstractC11800 abstractC11800, String str, int i) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m35958() {
        C21655 c21655;
        C0067 c0067 = (C0067) this.f48799.getLayoutManager();
        C17359.requireNonNull(c0067);
        int iFindFirstVisibleItemPosition = c0067.findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || (c21655 = ((C21655) this.f48792.get(iFindFirstVisibleItemPosition)).f69130) == null) {
            return null;
        }
        return m35932(c21655);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m35932(C21655 c21655) {
        C21655 c21656 = c21655.f69130;
        String str = c21655.f69127;
        if (c21656 == null) {
            return str;
        }
        return m35932(c21655.f69130) + "/" + str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9980 m35937(C1779 c1779) {
        return new C24639(this, c1779);
    }
}
