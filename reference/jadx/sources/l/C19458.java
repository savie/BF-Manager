package l;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ᩴ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B5F4 */
/* JADX INFO: loaded from: classes5.dex */
public class C19458 extends C0067 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final Set f62852 = C4681.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public View[] f62853;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f62854;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f62855;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Rect f62856;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f62857;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final SparseIntArray f62858;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final SparseIntArray f62859;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f62860;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f62861;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f62862;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C21696 f62863;

    public C19458(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f62862 = false;
        this.f62857 = -1;
        this.f62858 = new SparseIntArray();
        this.f62859 = new SparseIntArray();
        this.f62863 = new C21696();
        this.f62856 = new Rect();
        this.f62860 = -1;
        this.f62855 = -1;
        this.f62861 = -1;
        m44999(AbstractC21169.m48283(context, attributeSet, i, i2).f45484);
    }

    public C19458(Context context, int i) {
        super(context);
        this.f62862 = false;
        this.f62857 = -1;
        this.f62858 = new SparseIntArray();
        this.f62859 = new SparseIntArray();
        this.f62863 = new C21696();
        this.f62856 = new Rect();
        this.f62860 = -1;
        this.f62855 = -1;
        this.f62861 = -1;
        m44999(i);
    }

    public C19458(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, 1, false);
        this.f62862 = false;
        this.f62857 = -1;
        this.f62858 = new SparseIntArray();
        this.f62859 = new SparseIntArray();
        this.f62863 = new C21696();
        this.f62856 = new Rect();
        this.f62860 = -1;
        this.f62855 = -1;
        this.f62861 = -1;
        m44999(i);
    }

    @Override // l.C0067
    public final void setStackFromEnd(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // l.AbstractC21169
    public final int getRowCountForAccessibility(C2523 c2523, C15529 c15529) {
        if (this.mOrientation == 0) {
            return Math.min(this.f62857, getItemCount());
        }
        if (c15529.m37184() < 1) {
            return 0;
        }
        return m44986(c15529.m37184() - 1, c2523, c15529) + 1;
    }

    @Override // l.AbstractC21169
    public final int getColumnCountForAccessibility(C2523 c2523, C15529 c15529) {
        if (this.mOrientation == 1) {
            return Math.min(this.f62857, getItemCount());
        }
        if (c15529.m37184() < 1) {
            return 0;
        }
        return m44986(c15529.m37184() - 1, c2523, c15529) + 1;
    }

    @Override // l.AbstractC21169
    public final void onInitializeAccessibilityNodeInfoForItem(C2523 c2523, C15529 c15529, View view, C19835 c19835) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C10507)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c19835);
            return;
        }
        C10507 c10507 = (C10507) layoutParams;
        int iM44986 = m44986(c10507.f59428.getLayoutPosition(), c2523, c15529);
        if (this.mOrientation == 0) {
            c19835.m45642(C10884.m27635(c10507.f33431, c10507.f33430, iM44986, 1, false, false));
        } else {
            c19835.m45642(C10884.m27635(iM44986, 1, c10507.f33431, c10507.f33430, false, false));
        }
    }

    @Override // l.C0067, l.AbstractC21169
    public final void onInitializeAccessibilityNodeInfo(C2523 c2523, C15529 c15529, C19835 c19835) {
        super.onInitializeAccessibilityNodeInfo(c2523, c15529, c19835);
        c19835.m45639((CharSequence) GridView.class.getName());
        AbstractC12964 abstractC12964 = this.mRecyclerView.mAdapter;
        if (abstractC12964 == null || abstractC12964.getItemCount() <= 1) {
            return;
        }
        c19835.m45641(C8451.f27631);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:131:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:134:0x01db A[LOOP:3: B:129:0x01c7->B:134:0x01db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:142:0x0214  */
    /* JADX WARN: Code duplicated, block: B:143:0x0216  */
    /* JADX WARN: Code duplicated, block: B:145:0x0219 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0228  */
    /* JADX WARN: Code duplicated, block: B:153:0x0236  */
    /* JADX WARN: Code duplicated, block: B:156:0x0243  */
    /* JADX WARN: Code duplicated, block: B:163:0x0262  */
    /* JADX WARN: Code duplicated, block: B:166:0x027d A[EDGE_INSN: B:166:0x027d->B:167:0x027e BREAK  A[LOOP:2: B:126:0x01b9->B:135:0x01e3, LOOP_LABEL: LOOP:2: B:126:0x01b9->B:135:0x01e3]] */
    /* JADX WARN: Code duplicated, block: B:168:0x0280  */
    /* JADX WARN: Code duplicated, block: B:207:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:? A[LOOP:4: B:137:0x01ee->B:212:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:? A[LOOP:7: B:161:0x025c->B:222:?, LOOP_END, SYNTHETIC] */
    @Override // l.C0067, l.AbstractC21169
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        View childAt;
        AbstractC11800 childViewHolder;
        int iIntValue;
        int i2;
        TreeMap treeMap;
        int i3;
        Iterator it;
        Integer num;
        int iIntValue2;
        Iterator it2;
        Integer num2;
        TreeMap treeMap2;
        int i4;
        Iterator it3;
        Integer num3;
        int iIntValue3;
        Iterator it4;
        Integer num4;
        if (i == C8451.f27631.m22638() && i != -1) {
            int i5 = 0;
            while (true) {
                if (i5 >= getChildCount()) {
                    childAt = null;
                    break;
                }
                View childAt2 = getChildAt(i5);
                C17359.requireNonNull(childAt2);
                if (childAt2.isAccessibilityFocused()) {
                    childAt = getChildAt(i5);
                    break;
                }
                i5++;
            }
            if (childAt != null && bundle != null) {
                int i6 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (f62852.contains(Integer.valueOf(i6)) && (childViewHolder = this.mRecyclerView.getChildViewHolder(childAt)) != null) {
                    int absoluteAdapterPosition = childViewHolder.getAbsoluteAdapterPosition();
                    int iM44996 = m44996(absoluteAdapterPosition);
                    int iM44988 = m44988(absoluteAdapterPosition);
                    if (iM44996 >= 0 && iM44988 >= 0) {
                        if (!m44991(absoluteAdapterPosition).contains(Integer.valueOf(this.f62855)) || !m44993(m44988(absoluteAdapterPosition), absoluteAdapterPosition).contains(Integer.valueOf(this.f62861))) {
                            this.f62855 = iM44996;
                            this.f62861 = iM44988;
                        }
                        int i7 = this.f62855;
                        if (i7 == -1) {
                            i7 = iM44996;
                        }
                        int i8 = this.f62861;
                        if (i8 != -1) {
                            iM44988 = i8;
                        }
                        if (i6 == 17) {
                            iIntValue = absoluteAdapterPosition - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iM44997 = m44996(iIntValue);
                                    int iM44989 = m44988(iIntValue);
                                    if (iM44997 >= 0 && iM44989 >= 0) {
                                        if (this.mOrientation != 1) {
                                            if (m44991(iIntValue).contains(Integer.valueOf(i7)) && iM44989 < iM44988) {
                                                this.f62861 = iM44989;
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if ((iM44997 == i7 && iM44989 < iM44988) || iM44997 < i7) {
                                                this.f62855 = iM44997;
                                                this.f62861 = iM44989;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iM44996 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < getItemCount()) {
                                                    it2 = m44991(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iM44996) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.f62855 = iIntValue2;
                                                                this.f62861 = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iM44996 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < getItemCount()) {
                                                it4 = m44991(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iM44996) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.f62855 = iIntValue3;
                                                            this.f62861 = m44988(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                scrollToPosition(iIntValue);
                                this.f62860 = iIntValue;
                                return true;
                            }
                        } else if (i6 == 33) {
                            iIntValue = absoluteAdapterPosition - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iM44998 = m44996(iIntValue);
                                    int iM449810 = m44988(iIntValue);
                                    if (iM44998 >= 0 && iM449810 >= 0) {
                                        if (this.mOrientation != 1) {
                                            if (iM44998 < i7 && iM449810 == iM44988) {
                                                this.f62855 = ((Integer) Collections.max(m44991(iIntValue))).intValue();
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if (iM44998 < i7 && m44993(m44988(iIntValue), iIntValue).contains(Integer.valueOf(iM44988))) {
                                                this.f62855 = iM44998;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iM44996 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < getItemCount()) {
                                                    it2 = m44991(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iM44996) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.f62855 = iIntValue2;
                                                                this.f62861 = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iM44996 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < getItemCount()) {
                                                it4 = m44991(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iM44996) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.f62855 = iIntValue3;
                                                            this.f62861 = m44988(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                scrollToPosition(iIntValue);
                                this.f62860 = iIntValue;
                                return true;
                            }
                        } else if (i6 == 66) {
                            iIntValue = absoluteAdapterPosition + 1;
                            while (true) {
                                if (iIntValue < getItemCount()) {
                                    int iM44999 = m44996(iIntValue);
                                    int iM449811 = m44988(iIntValue);
                                    if (iM44999 >= 0 && iM449811 >= 0) {
                                        if (this.mOrientation != 1) {
                                            if (iM449811 > iM44988 && m44991(iIntValue).contains(Integer.valueOf(i7))) {
                                                this.f62861 = iM449811;
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if ((iM44999 == i7 && iM449811 > iM44988) || iM44999 > i7) {
                                                this.f62855 = iM44999;
                                                this.f62861 = iM449811;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iM44996 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < getItemCount()) {
                                                    it2 = m44991(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iM44996) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.f62855 = iIntValue2;
                                                                this.f62861 = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iM44996 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < getItemCount()) {
                                                it4 = m44991(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iM44996) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.f62855 = iIntValue3;
                                                            this.f62861 = m44988(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                scrollToPosition(iIntValue);
                                this.f62860 = iIntValue;
                                return true;
                            }
                        } else if (i6 == 130) {
                            iIntValue = absoluteAdapterPosition + 1;
                            while (true) {
                                if (iIntValue < getItemCount()) {
                                    int iM449910 = m44996(iIntValue);
                                    int iM449812 = m44988(iIntValue);
                                    if (iM449910 >= 0 && iM449812 >= 0) {
                                        if (this.mOrientation != 1) {
                                            if (iM449910 > i7 && iM449812 == iM44988) {
                                                this.f62855 = m44996(iIntValue);
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if (iM449910 > i7 && (iM449812 == iM44988 || m44993(m44988(iIntValue), iIntValue).contains(Integer.valueOf(iM44988)))) {
                                                this.f62855 = iM449910;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1 && (i2 = this.mOrientation) == 0) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iM44996 < 0 || i2 == 1) {
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                        treeMap = new TreeMap();
                                        i3 = 0;
                                        loop5: while (true) {
                                            if (i3 < getItemCount()) {
                                                it2 = m44991(i3).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        num2 = (Integer) it2.next();
                                                        if (num2.intValue() < 0) {
                                                            if (!treeMap.containsKey(num2)) {
                                                                treeMap.put(num2, Integer.valueOf(i3));
                                                            }
                                                        }
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                            } else {
                                                it = treeMap.keySet().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        num = (Integer) it.next();
                                                        iIntValue2 = num.intValue();
                                                        if (iIntValue2 > iM44996) {
                                                            iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                            this.f62855 = iIntValue2;
                                                            this.f62861 = 0;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                } else {
                                    if (iM44996 < 0 || i2 == 1) {
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                    treeMap2 = new TreeMap(Collections.reverseOrder());
                                    i4 = 0;
                                    loop2: while (true) {
                                        if (i4 < getItemCount()) {
                                            it4 = m44991(i4).iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    num4 = (Integer) it4.next();
                                                    if (num4.intValue() < 0) {
                                                        treeMap2.put(num4, Integer.valueOf(i4));
                                                    }
                                                } else {
                                                    i4++;
                                                }
                                            }
                                        } else {
                                            it3 = treeMap2.keySet().iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    num3 = (Integer) it3.next();
                                                    iIntValue3 = num3.intValue();
                                                    if (iIntValue3 < iM44996) {
                                                        iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.f62855 = iIntValue3;
                                                        this.f62861 = m44988(iIntValue);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                }
                            }
                            if (iIntValue != -1) {
                                scrollToPosition(iIntValue);
                                this.f62860 = iIntValue;
                                return true;
                            }
                        }
                    }
                }
            }
        } else if (i == 16908343 && bundle != null) {
            int i9 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i9 != -1 && i10 != -1) {
                int itemCount = this.mRecyclerView.mAdapter.getItemCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= itemCount) {
                        i11 = -1;
                        break;
                    }
                    C25227 c25227 = this.mRecyclerView;
                    int iM44992 = m44992(i11, c25227.mRecycler, c25227.mState);
                    C25227 c25228 = this.mRecyclerView;
                    int iM44986 = m44986(i11, c25228.mRecycler, c25228.mState);
                    if (this.mOrientation != 1) {
                        if (iM44992 == i9 && iM44986 == i10) {
                            break;
                        }
                        i11++;
                    } else {
                        if (iM44992 == i10 && iM44986 == i9) {
                            break;
                        }
                        i11++;
                    }
                }
                if (i11 > -1) {
                    scrollToPositionWithOffset(i11, 0);
                    return true;
                }
            }
        } else {
            return super.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m44996(int i) {
        if (this.mOrientation == 1) {
            C25227 c25227 = this.mRecyclerView;
            return m44986(i, c25227.mRecycler, c25227.mState);
        }
        C25227 c25228 = this.mRecyclerView;
        return m44992(i, c25228.mRecycler, c25228.mState);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m44988(int i) {
        if (this.mOrientation == 0) {
            C25227 c25227 = this.mRecyclerView;
            return m44986(i, c25227.mRecycler, c25227.mState);
        }
        C25227 c25228 = this.mRecyclerView;
        return m44992(i, c25228.mRecycler, c25228.mState);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private HashSet m44991(int i) {
        return m44993(m44996(i), i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private HashSet m44993(int i, int i2) {
        HashSet hashSet = new HashSet();
        C25227 c25227 = this.mRecyclerView;
        int iM44989 = m44989(i2, c25227.mRecycler, c25227.mState);
        for (int i3 = i; i3 < i + iM44989; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    @Override // l.C0067, l.AbstractC21169
    public final void onLayoutCompleted(C15529 c15529) {
        View viewFindViewByPosition;
        super.onLayoutCompleted(c15529);
        this.f62862 = false;
        int i = this.f62860;
        if (i == -1 || (viewFindViewByPosition = findViewByPosition(i)) == null) {
            return;
        }
        viewFindViewByPosition.sendAccessibilityEvent(67108864);
        this.f62860 = -1;
    }

    @Override // l.AbstractC21169
    public final void onItemsAdded(C25227 c25227, int i, int i2) {
        C21696 c21696 = this.f62863;
        c21696.m50620();
        c21696.f72653.clear();
    }

    @Override // l.AbstractC21169
    public final void onItemsChanged(C25227 c25227) {
        C21696 c21696 = this.f62863;
        c21696.m50620();
        c21696.f72653.clear();
    }

    @Override // l.AbstractC21169
    public final void onItemsRemoved(C25227 c25227, int i, int i2) {
        C21696 c21696 = this.f62863;
        c21696.m50620();
        c21696.f72653.clear();
    }

    @Override // l.AbstractC21169
    public final void onItemsUpdated(C25227 c25227, int i, int i2, Object obj) {
        C21696 c21696 = this.f62863;
        c21696.m50620();
        c21696.f72653.clear();
    }

    @Override // l.AbstractC21169
    public final void onItemsMoved(C25227 c25227, int i, int i2, int i3) {
        C21696 c21696 = this.f62863;
        c21696.m50620();
        c21696.f72653.clear();
    }

    @Override // l.C0067, l.AbstractC21169
    public final C18185 generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new C10507(-2, -1);
        }
        return new C10507(-1, -2);
    }

    @Override // l.AbstractC21169
    public final C18185 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C10507(context, attributeSet);
    }

    @Override // l.AbstractC21169
    public final C18185 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C10507 c10507;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c10507 = new C10507((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            c10507 = new C10507(layoutParams);
        }
        c10507.f33431 = -1;
        c10507.f33430 = 0;
        return c10507;
    }

    @Override // l.AbstractC21169
    public final boolean checkLayoutParams(C18185 c18185) {
        return c18185 instanceof C10507;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m44990() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m44995(height - paddingTop);
    }

    @Override // l.AbstractC21169
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int iM48280;
        int iM48281;
        if (this.f62854 == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iM48281 = AbstractC21169.m48280(i2, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f62854;
            iM48280 = AbstractC21169.m48280(i, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iM48280 = AbstractC21169.m48280(i, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f62854;
            iM48281 = AbstractC21169.m48280(i2, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iM48280, iM48281);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m44995(int i) {
        int i2;
        int[] iArr = this.f62854;
        int i3 = this.f62857;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f62854 = iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44998(int i, int i2) {
        if (this.mOrientation == 1 && isLayoutRTL()) {
            int[] iArr = this.f62854;
            int i3 = this.f62857;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.f62854;
        return iArr2[i2 + i] - iArr2[i];
    }

    @Override // l.C0067
    public final void onAnchorReady(C2523 c2523, C15529 c15529, C23934 c23934, int i) {
        super.onAnchorReady(c2523, c15529, c23934, i);
        m44990();
        if (c15529.m37184() > 0 && !c15529.f50525) {
            boolean z = i == 1;
            int iM44992 = m44992(c23934.f77491, c2523, c15529);
            if (z) {
                while (iM44992 > 0) {
                    int i2 = c23934.f77491;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c23934.f77491 = i3;
                    iM44992 = m44992(i3, c2523, c15529);
                }
            } else {
                int iM37184 = c15529.m37184() - 1;
                int i4 = c23934.f77491;
                while (i4 < iM37184) {
                    int i5 = i4 + 1;
                    int iM44993 = m44992(i5, c2523, c15529);
                    if (iM44993 <= iM44992) {
                        break;
                    }
                    i4 = i5;
                    iM44992 = iM44993;
                }
                c23934.f77491 = i4;
            }
        }
        m44994();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m44994() {
        View[] viewArr = this.f62853;
        if (viewArr == null || viewArr.length != this.f62857) {
            this.f62853 = new View[this.f62857];
        }
    }

    @Override // l.C0067, l.AbstractC21169
    public final int scrollHorizontallyBy(int i, C2523 c2523, C15529 c15529) {
        m44990();
        m44994();
        return super.scrollHorizontallyBy(i, c2523, c15529);
    }

    @Override // l.C0067, l.AbstractC21169
    public final int scrollVerticallyBy(int i, C2523 c2523, C15529 c15529) {
        m44990();
        m44994();
        return super.scrollVerticallyBy(i, c2523, c15529);
    }

    @Override // l.C0067
    public final View findReferenceChild(C2523 c2523, C15529 c15529, boolean z, boolean z2) {
        int i;
        int childCount;
        int childCount2 = getChildCount();
        int i2 = 1;
        if (z2) {
            childCount = getChildCount() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
        }
        int iM37184 = c15529.m37184();
        ensureLayoutState();
        int iMo3273 = this.mOrientationHelper.mo3273();
        int iMo3277 = this.mOrientationHelper.mo3277();
        View view = null;
        View view2 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iM37184 && m44992(position, c2523, c15529) == 0) {
                if (((C18185) childAt.getLayoutParams()).f59428.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.mo3280(childAt) < iMo3277 && this.mOrientationHelper.mo3268(childAt) >= iMo3273) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i2;
        }
        return view != null ? view : view2;
    }

    @Override // l.C0067
    public final void collectPrefetchPositionsForLayoutState(C15529 c15529, C14236 c14236, InterfaceC4015 interfaceC4015) {
        int i;
        int i2 = this.f62857;
        for (int i3 = 0; i3 < this.f62857 && (i = c14236.f44985) >= 0 && i < c15529.m37184() && i2 > 0; i3++) {
            ((C7304) interfaceC4015).m19987(c14236.f44985, Math.max(0, c14236.f44983));
            this.f62863.getClass();
            i2--;
            c14236.f44985 += c14236.f44984;
        }
    }

    @Override // l.C0067
    public final void layoutChunk(C2523 c2523, C15529 c15529, C14236 c14236, C3796 c3796) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iMo3271;
        int i9;
        int i10;
        int paddingLeft;
        int iMo3272;
        int iM48281;
        int iM48282;
        boolean z;
        int i11;
        View viewM34557;
        int iMo3275 = this.mOrientationHelper.mo3275();
        boolean z2 = iMo3275 != 1073741824;
        int i12 = getChildCount() > 0 ? this.f62854[this.f62857] : 0;
        if (z2) {
            m44990();
        }
        boolean z3 = c14236.f44984 == 1;
        int iM44992 = this.f62857;
        if (!z3) {
            iM44992 = m44992(c14236.f44985, c2523, c15529) + m44989(c14236.f44985, c2523, c15529);
        }
        int i13 = 0;
        while (i13 < this.f62857 && (i11 = c14236.f44985) >= 0 && i11 < c15529.m37184() && iM44992 > 0) {
            int i14 = c14236.f44985;
            int iM44989 = m44989(i14, c2523, c15529);
            if (iM44989 > this.f62857) {
                throw new IllegalArgumentException(C12669.m31437(this.f62857, " spans.", C1402.m5126("Item at position ", i14, " requires ", " spans but GridLayoutManager has only ", iM44989)));
            }
            iM44992 -= iM44989;
            if (iM44992 < 0 || (viewM34557 = c14236.m34557(c2523)) == null) {
                break;
            }
            this.f62853[i13] = viewM34557;
            i13++;
        }
        if (i13 == 0) {
            c3796.f12989 = true;
            return;
        }
        if (z3) {
            i = 0;
            i2 = i13;
            i3 = 1;
        } else {
            i = i13 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i15 = 0;
        while (i != i2) {
            View view = this.f62853[i];
            C10507 c10507 = (C10507) view.getLayoutParams();
            int iM449810 = m44989(getPosition(view), c2523, c15529);
            c10507.f33430 = iM449810;
            c10507.f33431 = i15;
            i15 += iM449810;
            i += i3;
        }
        float f = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < i13; i17++) {
            View view2 = this.f62853[i17];
            if (c14236.f44987 != null) {
                z = false;
                if (z3) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            } else if (z3) {
                addView(view2);
                z = false;
            } else {
                z = false;
                addView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.f62856);
            m44987(view2, iMo3275, z);
            int iMo3278 = this.mOrientationHelper.mo3278(view2);
            if (iMo3278 > i16) {
                i16 = iMo3278;
            }
            float fMo3271 = (this.mOrientationHelper.mo3271(view2) * 1.0f) / ((C10507) view2.getLayoutParams()).f33430;
            if (fMo3271 > f) {
                f = fMo3271;
            }
        }
        if (z2) {
            m44995(Math.max(Math.round(f * this.f62857), i12));
            i16 = 0;
            for (int i18 = 0; i18 < i13; i18++) {
                View view3 = this.f62853[i18];
                m44987(view3, 1073741824, true);
                int iMo3279 = this.mOrientationHelper.mo3278(view3);
                if (iMo3279 > i16) {
                    i16 = iMo3279;
                }
            }
        }
        for (int i19 = 0; i19 < i13; i19++) {
            View view4 = this.f62853[i19];
            if (this.mOrientationHelper.mo3278(view4) != i16) {
                C10507 c10508 = (C10507) view4.getLayoutParams();
                Rect rect = c10508.f59425;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c10508).topMargin + ((ViewGroup.MarginLayoutParams) c10508).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c10508).leftMargin + ((ViewGroup.MarginLayoutParams) c10508).rightMargin;
                int iM44998 = m44998(c10508.f33431, c10508.f33430);
                if (this.mOrientation == 1) {
                    iM48282 = AbstractC21169.m48281(iM44998, 1073741824, i21, ((ViewGroup.MarginLayoutParams) c10508).width, false);
                    iM48281 = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    iM48281 = AbstractC21169.m48281(iM44998, 1073741824, i20, ((ViewGroup.MarginLayoutParams) c10508).height, false);
                    iM48282 = iMakeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, iM48282, iM48281, (C18185) view4.getLayoutParams())) {
                    view4.measure(iM48282, iM48281);
                }
            }
        }
        c3796.f12987 = i16;
        if (this.mOrientation != 1) {
            if (c14236.f44981 == -1) {
                int i22 = c14236.f44976;
                int i23 = i22 - i16;
                i4 = i22;
                i5 = i23;
            } else {
                int i24 = c14236.f44976;
                i4 = i16 + i24;
                i5 = i24;
            }
            i6 = 0;
            i7 = 0;
        } else if (c14236.f44981 == -1) {
            i7 = c14236.f44976;
            i6 = i7 - i16;
            i5 = 0;
            i4 = 0;
        } else {
            i6 = c14236.f44976;
            i7 = i6 + i16;
            i4 = 0;
            i5 = 0;
        }
        int i25 = 0;
        while (i25 < i13) {
            View view5 = this.f62853[i25];
            C10507 c10509 = (C10507) view5.getLayoutParams();
            if (this.mOrientation == 1) {
                if (isLayoutRTL()) {
                    iMo3272 = this.f62854[this.f62857 - c10509.f33431] + getPaddingLeft();
                    paddingLeft = iMo3272 - this.mOrientationHelper.mo3271(view5);
                } else {
                    paddingLeft = getPaddingLeft() + this.f62854[c10509.f33431];
                    iMo3272 = this.mOrientationHelper.mo3271(view5) + paddingLeft;
                }
                i9 = paddingLeft;
                iMo3271 = i7;
                i8 = i6;
                i10 = iMo3272;
            } else {
                int paddingTop = getPaddingTop() + this.f62854[c10509.f33431];
                i8 = paddingTop;
                iMo3271 = this.mOrientationHelper.mo3271(view5) + paddingTop;
                i9 = i5;
                i10 = i4;
            }
            layoutDecoratedWithMargins(view5, i9, i8, i10, iMo3271);
            if (c10509.f59428.isRemoved() || c10509.f59428.isUpdated()) {
                c3796.f12990 = true;
            }
            c3796.f12988 |= view5.hasFocusable();
            i25++;
            i7 = iMo3271;
            i6 = i8;
            i5 = i9;
            i4 = i10;
        }
        Arrays.fill(this.f62853, (Object) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44987(View view, int i, boolean z) {
        int iM48281;
        int iM48282;
        boolean zShouldMeasureChild;
        C10507 c10507 = (C10507) view.getLayoutParams();
        Rect rect = c10507.f59425;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c10507).topMargin + ((ViewGroup.MarginLayoutParams) c10507).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c10507).leftMargin + ((ViewGroup.MarginLayoutParams) c10507).rightMargin;
        int iM44998 = m44998(c10507.f33431, c10507.f33430);
        if (this.mOrientation == 1) {
            iM48282 = AbstractC21169.m48281(iM44998, i, i3, ((ViewGroup.MarginLayoutParams) c10507).width, false);
            iM48281 = AbstractC21169.m48281(this.mOrientationHelper.mo3272(), getHeightMode(), i2, ((ViewGroup.MarginLayoutParams) c10507).height, true);
        } else {
            int iM48283 = AbstractC21169.m48281(iM44998, i, i2, ((ViewGroup.MarginLayoutParams) c10507).height, false);
            int iM48284 = AbstractC21169.m48281(this.mOrientationHelper.mo3272(), getWidthMode(), i3, ((ViewGroup.MarginLayoutParams) c10507).width, true);
            iM48281 = iM48283;
            iM48282 = iM48284;
        }
        C18185 c18185 = (C18185) view.getLayoutParams();
        if (z) {
            zShouldMeasureChild = shouldReMeasureChild(view, iM48282, iM48281, c18185);
        } else {
            zShouldMeasureChild = shouldMeasureChild(view, iM48282, iM48281, c18185);
        }
        if (zShouldMeasureChild) {
            view.measure(iM48282, iM48281);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44997() {
        return this.f62857;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44999(int i) {
        if (i == this.f62857) {
            return;
        }
        this.f62862 = true;
        if (i < 1) {
            throw new IllegalArgumentException(C13645.m33382(i, "Span count should be at least 1. Provided "));
        }
        this.f62857 = i;
        this.f62863.m50620();
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00e8 A[PHI: r17 r18 r19
      0x00e8: PHI (r17v6 int) = (r17v5 int), (r17v5 int), (r17v7 int) binds: [B:59:0x00dd, B:65:0x00e6, B:55:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r18v2 int) = (r18v1 int), (r18v1 int), (r18v3 int) binds: [B:59:0x00dd, B:65:0x00e6, B:55:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r19v1 int) = (r19v0 int), (r19v0 int), (r19v2 int) binds: [B:59:0x00dd, B:65:0x00e6, B:55:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fd  */
    @Override // l.C0067, l.AbstractC21169
    public final View onFocusSearchFailed(View view, int i, C2523 c2523, C15529 c15529) {
        int childCount;
        int childCount2;
        int i2;
        View view2;
        int i3;
        int i4;
        int i5;
        C2523 c2524 = c2523;
        C15529 c155210 = c15529;
        View viewFindContainingItemView = findContainingItemView(view);
        View view3 = null;
        if (viewFindContainingItemView == null) {
            return null;
        }
        C10507 c10507 = (C10507) viewFindContainingItemView.getLayoutParams();
        int i6 = c10507.f33431;
        int i7 = c10507.f33430 + i6;
        if (super.onFocusSearchFailed(view, i, c2523, c15529) == null) {
            return null;
        }
        if ((convertFocusDirectionToLayoutDirection(i) == 1) != this.mShouldReverseLayout) {
            childCount2 = getChildCount() - 1;
            childCount = -1;
            i2 = -1;
        } else {
            childCount = getChildCount();
            childCount2 = 0;
            i2 = 1;
        }
        boolean z = this.mOrientation == 1 && isLayoutRTL();
        int iM44986 = m44986(childCount2, c2524, c155210);
        int i8 = childCount2;
        int i9 = i2;
        int iMin = 0;
        int iMin2 = 0;
        int i10 = -1;
        int i11 = -1;
        View view4 = null;
        while (i8 != childCount) {
            int i12 = childCount;
            int iM44987 = m44986(i8, c2524, c155210);
            View childAt = getChildAt(i8);
            if (childAt == viewFindContainingItemView) {
                break;
            }
            if (!childAt.hasFocusable() || iM44987 == iM44986) {
                C10507 c10508 = (C10507) childAt.getLayoutParams();
                int i13 = c10508.f33431;
                view2 = viewFindContainingItemView;
                int i14 = c10508.f33430 + i13;
                if (childAt.hasFocusable() && i13 == i6 && i14 == i7) {
                    return childAt;
                }
                if (!(childAt.hasFocusable() && view3 == null) && (childAt.hasFocusable() || view4 != null)) {
                    i3 = iM44986;
                    int iMin3 = Math.min(i14, i7) - Math.max(i13, i6);
                    if (!childAt.hasFocusable()) {
                        if (view3 == null) {
                            i4 = iMin2;
                            i5 = i10;
                            if (isViewPartiallyVisible(childAt, false, true)) {
                                if (iMin3 <= iMin) {
                                    if (iMin3 == iMin) {
                                        if (z == (i13 > i11)) {
                                            if (childAt.hasFocusable()) {
                                                int i15 = c10508.f33431;
                                                iMin2 = Math.min(i14, i7) - Math.max(i13, i6);
                                                i10 = i15;
                                                view3 = childAt;
                                            } else {
                                                i11 = c10508.f33431;
                                                iMin = Math.min(i14, i7) - Math.max(i13, i6);
                                                view4 = childAt;
                                            }
                                        }
                                    }
                                } else if (childAt.hasFocusable()) {
                                    int i16 = c10508.f33431;
                                    iMin2 = Math.min(i14, i7) - Math.max(i13, i6);
                                    i10 = i16;
                                    view3 = childAt;
                                } else {
                                    i11 = c10508.f33431;
                                    iMin = Math.min(i14, i7) - Math.max(i13, i6);
                                    view4 = childAt;
                                }
                                i8 += i9;
                                childCount = i12;
                                c2524 = c2523;
                                c155210 = c15529;
                                viewFindContainingItemView = view2;
                                iM44986 = i3;
                            }
                        }
                        iMin2 = i4;
                        i10 = i5;
                        i8 += i9;
                        childCount = i12;
                        c2524 = c2523;
                        c155210 = c15529;
                        viewFindContainingItemView = view2;
                        iM44986 = i3;
                    } else if (iMin3 <= iMin2) {
                        if (iMin3 == iMin2) {
                            if (z == (i13 > i10)) {
                            }
                            iMin2 = i4;
                            i10 = i5;
                            i8 += i9;
                            childCount = i12;
                            c2524 = c2523;
                            c155210 = c15529;
                            viewFindContainingItemView = view2;
                            iM44986 = i3;
                        }
                    }
                } else {
                    i3 = iM44986;
                }
                i4 = iMin2;
                i5 = i10;
                if (childAt.hasFocusable()) {
                    int i17 = c10508.f33431;
                    iMin2 = Math.min(i14, i7) - Math.max(i13, i6);
                    i10 = i17;
                    view3 = childAt;
                } else {
                    i11 = c10508.f33431;
                    iMin = Math.min(i14, i7) - Math.max(i13, i6);
                    view4 = childAt;
                    iMin2 = i4;
                    i10 = i5;
                }
                i8 += i9;
                childCount = i12;
                c2524 = c2523;
                c155210 = c15529;
                viewFindContainingItemView = view2;
                iM44986 = i3;
            } else {
                if (view3 != null) {
                    break;
                }
                view2 = viewFindContainingItemView;
                i3 = iM44986;
            }
            i4 = iMin2;
            i5 = i10;
            iMin2 = i4;
            i10 = i5;
            i8 += i9;
            childCount = i12;
            c2524 = c2523;
            c155210 = c15529;
            viewFindContainingItemView = view2;
            iM44986 = i3;
        }
        return view3 != null ? view3 : view4;
    }

    @Override // l.C0067, l.AbstractC21169
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f62862;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m44986(int i, C2523 c2523, C15529 c15529) {
        boolean z = c15529.f50525;
        C21696 c21696 = this.f62863;
        if (z && (i = c2523.m8413(i)) == -1) {
            return 0;
        }
        int i2 = this.f62857;
        c21696.getClass();
        return AbstractC22442.m50619(i, i2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m44989(int i, C2523 c2523, C15529 c15529) {
        boolean z = c15529.f50525;
        C21696 c21696 = this.f62863;
        if (!z) {
            c21696.getClass();
            return 1;
        }
        int i2 = this.f62858.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c2523.m8413(i) == -1) {
            return 1;
        }
        c21696.getClass();
        return 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m44992(int i, C2523 c2523, C15529 c15529) {
        int i2;
        boolean z = c15529.f50525;
        C21696 c21696 = this.f62863;
        if (!z) {
            i2 = this.f62857;
            c21696.getClass();
        } else {
            int i3 = this.f62859.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            i = c2523.m8413(i);
            if (i == -1) {
                return 0;
            }
            i2 = this.f62857;
            c21696.getClass();
        }
        return i % i2;
    }

    @Override // l.C0067, l.AbstractC21169
    public final void onLayoutChildren(C2523 c2523, C15529 c15529) {
        boolean z = c15529.f50525;
        SparseIntArray sparseIntArray = this.f62859;
        SparseIntArray sparseIntArray2 = this.f62858;
        if (z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C10507 c10507 = (C10507) getChildAt(i).getLayoutParams();
                int layoutPosition = c10507.f59428.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, c10507.f33430);
                sparseIntArray.put(layoutPosition, c10507.f33431);
            }
        }
        super.onLayoutChildren(c2523, c15529);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }
}
