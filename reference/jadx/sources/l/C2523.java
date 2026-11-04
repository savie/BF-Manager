package l;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.motion.MotionUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۖ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2523 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f8064;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25227 f8065;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f8066;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f8067;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f8068;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f8069;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f8070;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C9234 f8071;

    public C2523(C25227 c25227) {
        this.f8065 = c25227;
        ArrayList arrayList = new ArrayList();
        this.f8064 = arrayList;
        this.f8066 = null;
        this.f8070 = new ArrayList();
        this.f8068 = C4681.unmodifiableList(arrayList);
        this.f8069 = 2;
        this.f8067 = 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8420(AbstractC12964 abstractC12964, AbstractC12964 abstractC12965, boolean z) {
        this.f8064.clear();
        m8424();
        m8411(abstractC12964, true);
        C9234 c9234M8414 = m8414();
        if (abstractC12964 != null) {
            c9234M8414.f30072--;
        }
        if (!z && c9234M8414.f30072 == 0) {
            SparseArray sparseArray = c9234M8414.f30073;
            for (int i = 0; i < sparseArray.size(); i++) {
                C1032 c1032 = (C1032) sparseArray.valueAt(i);
                Iterator it = c1032.f3746.iterator();
                while (it.hasNext()) {
                    C9880.m25687(((AbstractC11800) it.next()).itemView);
                }
                c1032.f3746.clear();
            }
        }
        if (abstractC12965 != null) {
            c9234M8414.f30072++;
        } else {
            c9234M8414.getClass();
        }
        m8412();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m8430(int i) {
        this.f8069 = i;
        m8423();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m8423() {
        AbstractC21169 abstractC21169 = this.f8065.mLayout;
        this.f8067 = this.f8069 + (abstractC21169 != null ? abstractC21169.mPrefetchMaxCountObserved : 0);
        ArrayList arrayList = this.f8070;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || arrayList.size() <= this.f8067) {
                return;
            } else {
                m8422(size);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m8426() {
        return this.f8068;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m8413(int i) {
        C25227 c25227 = this.f8065;
        if (i >= 0 && i < c25227.mState.m37184()) {
            return !c25227.mState.f50525 ? i : c25227.mAdapterHelper.m50264(i, 0);
        }
        StringBuilder sbM12235 = C3769.m12235(i, "invalid position ", ". State item count is ");
        sbM12235.append(c25227.mState.m37184());
        sbM12235.append(c25227.exceptionLabel());
        throw new IndexOutOfBoundsException(sbM12235.toString());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View m8425(int i) {
        return m8415(i, C25227.FOREVER_NS).itemView;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018f  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:118:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:122:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:126:0x020a  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:167:0x02da  */
    /* JADX WARN: Code duplicated, block: B:169:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:174:0x02fd A[LOOP:5: B:170:0x02e8->B:174:0x02fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x0300 A[EDGE_INSN: B:175:0x0300->B:176:0x0301 BREAK  A[LOOP:5: B:170:0x02e8->B:174:0x02fd]] */
    /* JADX WARN: Code duplicated, block: B:177:0x0303  */
    /* JADX WARN: Code duplicated, block: B:179:0x030a  */
    /* JADX WARN: Code duplicated, block: B:181:0x0310  */
    /* JADX WARN: Code duplicated, block: B:184:0x0318  */
    /* JADX WARN: Code duplicated, block: B:197:0x0375  */
    /* JADX WARN: Code duplicated, block: B:206:0x0395  */
    /* JADX WARN: Code duplicated, block: B:212:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:214:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:218:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:220:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:227:0x0408  */
    /* JADX WARN: Code duplicated, block: B:232:0x041c  */
    /* JADX WARN: Code duplicated, block: B:233:0x042d  */
    /* JADX WARN: Code duplicated, block: B:236:0x0435  */
    /* JADX WARN: Code duplicated, block: B:239:0x044e  */
    /* JADX WARN: Code duplicated, block: B:241:0x0456  */
    /* JADX WARN: Code duplicated, block: B:242:0x045b  */
    /* JADX WARN: Code duplicated, block: B:246:0x0461  */
    /* JADX WARN: Code duplicated, block: B:248:0x0469  */
    /* JADX WARN: Code duplicated, block: B:250:0x0473  */
    /* JADX WARN: Code duplicated, block: B:253:0x047a  */
    /* JADX WARN: Code duplicated, block: B:257:0x0485  */
    /* JADX WARN: Code duplicated, block: B:258:0x0491  */
    /* JADX WARN: Code duplicated, block: B:260:0x0497  */
    /* JADX WARN: Code duplicated, block: B:261:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:264:0x04a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:266:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:277:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0300 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[EDGE_INSN: B:35:0x0083->B:36:0x0084 BREAK  A[LOOP:0: B:14:0x0027->B:20:0x0041]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:70:0x0103 A[EDGE_INSN: B:70:0x0103->B:87:0x015b BREAK  A[LOOP:1: B:43:0x0095->B:55:0x00c0]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0111  */
    /* JADX WARN: Code duplicated, block: B:73:0x012c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0133  */
    /* JADX WARN: Code duplicated, block: B:88:0x015d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0163  */
    /* JADX WARN: Code duplicated, block: B:92:0x0167  */
    /* JADX WARN: Code duplicated, block: B:98:0x018b  */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x0111, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11800 m8415(int i, long j) {
        AbstractC11800 abstractC11800CreateViewHolder;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j2;
        boolean z2;
        AbstractC11800 abstractC11800;
        long nanoTime;
        boolean z3;
        boolean z4;
        View view;
        C17767 c17767;
        C22687 itemDelegate;
        ViewGroup.LayoutParams layoutParams;
        C18185 c18185;
        boolean z5;
        int iM50264;
        long nanoTime2;
        C25227 c25227M56237;
        C1032 c1032;
        AbstractC11800 abstractC11801;
        View view2;
        ArrayList arrayList3;
        int size;
        int size2;
        int i2;
        ArrayList arrayList4;
        int size3;
        int i3;
        View view3;
        int size4;
        int i4;
        AbstractC11800 abstractC11802;
        int iM37159;
        AbstractC11800 abstractC11800M56274;
        int i5;
        boolean z6;
        int size5;
        int iM50265;
        C25227 c25227 = this.f8065;
        if (i < 0 || i >= c25227.mState.m37184()) {
            StringBuilder sbM5126 = C1402.m5126("Invalid item position ", i, MotionUtils.EASING_TYPE_FORMAT_START, "). Item count:", i);
            sbM5126.append(c25227.mState.m37184());
            sbM5126.append(c25227.exceptionLabel());
            throw new IndexOutOfBoundsException(sbM5126.toString());
        }
        if (c25227.mState.f50525) {
            ArrayList arrayList5 = this.f8066;
            if (arrayList5 != null && (size5 = arrayList5.size()) != 0) {
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        if (c25227.mAdapter.hasStableIds() && (iM50265 = c25227.mAdapterHelper.m50264(i, 0)) > 0 && iM50265 < c25227.mAdapter.getItemCount()) {
                            long itemId = c25227.mAdapter.getItemId(iM50265);
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size5) {
                                    abstractC11800CreateViewHolder = null;
                                    break;
                                }
                                AbstractC11800 abstractC11803 = (AbstractC11800) this.f8066.get(i7);
                                if (!abstractC11803.wasReturnedFromScrap() && abstractC11803.getItemId() == itemId) {
                                    abstractC11803.addFlags(32);
                                    abstractC11800CreateViewHolder = abstractC11803;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            abstractC11800CreateViewHolder = null;
                            break;
                        }
                    } else {
                        abstractC11800CreateViewHolder = (AbstractC11800) this.f8066.get(i6);
                        if (!abstractC11800CreateViewHolder.wasReturnedFromScrap() && abstractC11800CreateViewHolder.getLayoutPosition() == i) {
                            abstractC11800CreateViewHolder.addFlags(32);
                            break;
                        }
                        i6++;
                    }
                }
            } else {
                abstractC11800CreateViewHolder = null;
                break;
            }
            z = abstractC11800CreateViewHolder != null;
            arrayList = this.f8064;
            arrayList2 = this.f8070;
            if (abstractC11800CreateViewHolder == null) {
                size2 = arrayList.size();
                i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        arrayList4 = c25227.mChildHelper.f50473;
                        size3 = arrayList4.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size3) {
                                view3 = null;
                                break;
                            }
                            view3 = (View) arrayList4.get(i3);
                            abstractC11800M56274 = C25227.m56274(view3);
                            if (abstractC11800M56274.getLayoutPosition() != i && !abstractC11800M56274.isInvalid() && !abstractC11800M56274.isRemoved()) {
                                break;
                            }
                            i3++;
                        }
                        if (view3 != null) {
                            size4 = arrayList2.size();
                            i4 = 0;
                            while (true) {
                                if (i4 < size4) {
                                    abstractC11800CreateViewHolder = null;
                                    break;
                                }
                                abstractC11802 = (AbstractC11800) arrayList2.get(i4);
                                if (abstractC11802.isInvalid() && abstractC11802.getLayoutPosition() == i && !abstractC11802.isAttachedToTransitionOverlay()) {
                                    arrayList2.remove(i4);
                                    if (C25227.sVerboseLoggingEnabled) {
                                        abstractC11802.toString();
                                    }
                                } else {
                                    i4++;
                                }
                            }
                        } else {
                            abstractC11800CreateViewHolder = C25227.m56274(view3);
                            c25227.mChildHelper.m37157(view3);
                            iM37159 = c25227.mChildHelper.m37159(view3);
                            if (iM37159 != -1) {
                                c25227.mChildHelper.m37151(iM37159);
                                m8427(view3);
                                abstractC11800CreateViewHolder.addFlags(8224);
                                break;
                            }
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + abstractC11800CreateViewHolder + c25227.exceptionLabel());
                        }
                    } else {
                        abstractC11802 = (AbstractC11800) arrayList.get(i2);
                        if (!abstractC11802.wasReturnedFromScrap() || abstractC11802.getLayoutPosition() != i || abstractC11802.isInvalid() || (!c25227.mState.f50525 && abstractC11802.isRemoved())) {
                            i2++;
                        } else {
                            abstractC11802.addFlags(32);
                        }
                    }
                    abstractC11800CreateViewHolder = abstractC11802;
                    break;
                }
                if (abstractC11800CreateViewHolder != null) {
                    if (!abstractC11800CreateViewHolder.isRemoved()) {
                        i5 = abstractC11800CreateViewHolder.mPosition;
                        if (i5 >= 0 || i5 >= c25227.mAdapter.getItemCount()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC11800CreateViewHolder + c25227.exceptionLabel());
                        }
                        z6 = (c25227.mState.f50525 || c25227.mAdapter.getItemViewType(abstractC11800CreateViewHolder.mPosition) == abstractC11800CreateViewHolder.getItemViewType()) && (!c25227.mAdapter.hasStableIds() || abstractC11800CreateViewHolder.getItemId() == c25227.mAdapter.getItemId(abstractC11800CreateViewHolder.mPosition));
                    } else {
                        if (!C25227.sDebugAssertionsEnabled && !c25227.mState.f50525) {
                            throw new IllegalStateException("should not receive a removed view unless it is pre layout" + c25227.exceptionLabel());
                        }
                        z6 = c25227.mState.f50525;
                    }
                    if (z6) {
                        z = true;
                    } else {
                        abstractC11800CreateViewHolder.addFlags(4);
                        if (abstractC11800CreateViewHolder.isScrap()) {
                            c25227.removeDetachedView(abstractC11800CreateViewHolder.itemView, false);
                            abstractC11800CreateViewHolder.unScrap();
                        } else if (abstractC11800CreateViewHolder.wasReturnedFromScrap()) {
                            abstractC11800CreateViewHolder.clearReturnedFromScrapFlag();
                        }
                        m8418(abstractC11800CreateViewHolder);
                        abstractC11800CreateViewHolder = null;
                    }
                }
            }
            if (abstractC11800CreateViewHolder == null) {
                iM50264 = c25227.mAdapterHelper.m50264(i, 0);
                if (iM50264 >= 0 || iM50264 >= c25227.mAdapter.getItemCount()) {
                    StringBuilder sbM5127 = C1402.m5126("Inconsistency detected. Invalid item position ", i, "(offset:", ").state:", iM50264);
                    sbM5127.append(c25227.mState.m37184());
                    sbM5127.append(c25227.exceptionLabel());
                    throw new IndexOutOfBoundsException(sbM5127.toString());
                }
                int itemViewType = c25227.mAdapter.getItemViewType(iM50264);
                if (c25227.mAdapter.hasStableIds()) {
                    long itemId2 = c25227.mAdapter.getItemId(iM50264);
                    int size6 = arrayList.size() - 1;
                    while (true) {
                        if (size6 < 0) {
                            j2 = C25227.FOREVER_NS;
                            int size7 = arrayList2.size() - 1;
                            while (true) {
                                if (size7 >= 0) {
                                    AbstractC11800 abstractC11804 = (AbstractC11800) arrayList2.get(size7);
                                    if (abstractC11804.getItemId() != itemId2 || abstractC11804.isAttachedToTransitionOverlay()) {
                                        size7--;
                                    } else {
                                        if (itemViewType == abstractC11804.getItemViewType()) {
                                            arrayList2.remove(size7);
                                            abstractC11800CreateViewHolder = abstractC11804;
                                            break;
                                        }
                                        m8422(size7);
                                    }
                                }
                                abstractC11800CreateViewHolder = null;
                                break;
                            }
                        }
                        Object obj = arrayList.get(size6);
                        j2 = C25227.FOREVER_NS;
                        AbstractC11800 abstractC11805 = (AbstractC11800) obj;
                        if (abstractC11805.getItemId() == itemId2 && !abstractC11805.wasReturnedFromScrap()) {
                            if (itemViewType == abstractC11805.getItemViewType()) {
                                abstractC11805.addFlags(32);
                                if (abstractC11805.isRemoved() && !c25227.mState.f50525) {
                                    abstractC11805.setFlags(2, 14);
                                }
                                abstractC11800CreateViewHolder = abstractC11805;
                                break;
                            }
                            arrayList.remove(size6);
                            c25227.removeDetachedView(abstractC11805.itemView, false);
                            AbstractC11800 abstractC11800M56275 = C25227.m56274(abstractC11805.itemView);
                            abstractC11800M56275.mScrapContainer = null;
                            abstractC11800M56275.mInChangeScrap = false;
                            abstractC11800M56275.clearReturnedFromScrapFlag();
                            m8418(abstractC11800M56275);
                        }
                        size6--;
                    }
                    if (abstractC11800CreateViewHolder != null) {
                        abstractC11800CreateViewHolder.mPosition = iM50264;
                        z2 = true;
                    }
                    if (abstractC11800CreateViewHolder == null) {
                        int i8 = C25227.HORIZONTAL;
                        c1032 = (C1032) m8414().f30073.get(itemViewType);
                        if (c1032 != null) {
                            abstractC11801 = null;
                            break;
                        }
                        arrayList3 = c1032.f3746;
                        if (arrayList3.isEmpty()) {
                            size = arrayList3.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    abstractC11801 = null;
                                    break;
                                }
                                if (!((AbstractC11800) arrayList3.get(size)).isAttachedToTransitionOverlay()) {
                                    abstractC11801 = (AbstractC11800) arrayList3.remove(size);
                                    break;
                                }
                                size--;
                            }
                        } else {
                            abstractC11801 = null;
                            break;
                        }
                        if (abstractC11801 != null) {
                            abstractC11801.resetInternal();
                            if (C25227.FORCE_INVALIDATE_DISPLAY_LIST) {
                                view2 = abstractC11801.itemView;
                                if (view2 instanceof ViewGroup) {
                                    m8410((ViewGroup) view2, false);
                                }
                            }
                        }
                        abstractC11800CreateViewHolder = abstractC11801;
                    }
                    if (abstractC11800CreateViewHolder == null) {
                        nanoTime2 = c25227.getNanoTime();
                        if (j == j2 && !this.f8071.m24427(nanoTime2, itemViewType, j)) {
                            return null;
                        }
                        abstractC11800CreateViewHolder = c25227.mAdapter.createViewHolder(c25227, itemViewType);
                        if (C25227.ALLOW_THREAD_GAP_WORK && (c25227M56237 = C25227.m56237(abstractC11800CreateViewHolder.itemView)) != null) {
                            abstractC11800CreateViewHolder.mNestedRecyclerView = new WeakReference(c25227M56237);
                        }
                        this.f8071.m24426(itemViewType, c25227.getNanoTime() - nanoTime2);
                    }
                } else {
                    j2 = C25227.FOREVER_NS;
                }
                z2 = z;
                if (abstractC11800CreateViewHolder == null) {
                    int i9 = C25227.HORIZONTAL;
                    c1032 = (C1032) m8414().f30073.get(itemViewType);
                    if (c1032 != null) {
                        abstractC11801 = null;
                        break;
                    }
                    arrayList3 = c1032.f3746;
                    if (arrayList3.isEmpty()) {
                        abstractC11801 = null;
                        break;
                    }
                    size = arrayList3.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            abstractC11801 = null;
                            break;
                        }
                        if (!((AbstractC11800) arrayList3.get(size)).isAttachedToTransitionOverlay()) {
                            abstractC11801 = (AbstractC11800) arrayList3.remove(size);
                            break;
                        }
                        size--;
                    }
                    if (abstractC11801 != null) {
                        abstractC11801.resetInternal();
                        if (C25227.FORCE_INVALIDATE_DISPLAY_LIST) {
                            view2 = abstractC11801.itemView;
                            if (view2 instanceof ViewGroup) {
                                m8410((ViewGroup) view2, false);
                            }
                        }
                    }
                    abstractC11800CreateViewHolder = abstractC11801;
                }
                if (abstractC11800CreateViewHolder == null) {
                    nanoTime2 = c25227.getNanoTime();
                    if (j == j2) {
                    }
                    abstractC11800CreateViewHolder = c25227.mAdapter.createViewHolder(c25227, itemViewType);
                    if (C25227.ALLOW_THREAD_GAP_WORK) {
                        abstractC11800CreateViewHolder.mNestedRecyclerView = new WeakReference(c25227M56237);
                    }
                    this.f8071.m24426(itemViewType, c25227.getNanoTime() - nanoTime2);
                }
            } else {
                j2 = C25227.FOREVER_NS;
                z2 = z;
            }
            abstractC11800 = abstractC11800CreateViewHolder;
            if (z2 && !c25227.mState.f50525 && abstractC11800.hasAnyOfTheFlags(8192)) {
                abstractC11800.setFlags(0, 8192);
                if (c25227.mState.f50528) {
                    AbstractC3269.m10752(abstractC11800);
                    AbstractC3269 abstractC3269 = c25227.mItemAnimator;
                    abstractC11800.getUnmodifiedPayloads();
                    abstractC3269.getClass();
                    C23407 c23407 = new C23407();
                    c23407.m52597(abstractC11800);
                    c25227.recordAnimationInfoIfBouncedHiddenView(abstractC11800, c23407);
                }
            }
            if (c25227.mState.f50525 || !abstractC11800.isBound()) {
                if (abstractC11800.isBound() || abstractC11800.needsUpdate() || abstractC11800.isInvalid()) {
                    if (!C25227.sDebugAssertionsEnabled && abstractC11800.isRemoved()) {
                        throw new IllegalStateException("Removed holder should be bound and it should come here only in pre-layout. Holder: " + abstractC11800 + c25227.exceptionLabel());
                    }
                    int iM50266 = c25227.mAdapterHelper.m50264(i, 0);
                    abstractC11800.mBindingAdapter = null;
                    abstractC11800.mOwnerRecyclerView = c25227;
                    int itemViewType2 = abstractC11800.getItemViewType();
                    nanoTime = c25227.getNanoTime();
                    if (j != j2 || this.f8071.m24425(nanoTime, itemViewType2, j)) {
                        if (abstractC11800.isTmpDetached()) {
                            c25227.attachViewToParent(abstractC11800.itemView, c25227.getChildCount(), abstractC11800.itemView.getLayoutParams());
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c25227.mAdapter.bindViewHolder(abstractC11800, iM50266);
                        if (z3) {
                            c25227.detachViewFromParent(abstractC11800.itemView);
                        }
                        this.f8071.m24423(abstractC11800.getItemViewType(), c25227.getNanoTime() - nanoTime);
                        if (c25227.isAccessibilityEnabled()) {
                            view = abstractC11800.itemView;
                            if (view.getImportantForAccessibility() == 0) {
                                view.setImportantForAccessibility(1);
                            }
                            c17767 = c25227.mAccessibilityDelegate;
                            if (c17767 != null) {
                                itemDelegate = c17767.getItemDelegate();
                                if (itemDelegate instanceof C17021) {
                                    ((C17021) itemDelegate).m40119(view);
                                }
                                C22666.m51098(view, itemDelegate);
                            }
                        }
                        if (c25227.mState.f50525) {
                            abstractC11800.mPreLayoutPosition = i;
                        }
                        z4 = true;
                    }
                }
                layoutParams = abstractC11800.itemView.getLayoutParams();
                if (layoutParams == null) {
                    c18185 = (C18185) c25227.generateDefaultLayoutParams();
                    abstractC11800.itemView.setLayoutParams(c18185);
                } else if (c25227.checkLayoutParams(layoutParams)) {
                    c18185 = (C18185) layoutParams;
                } else {
                    c18185 = (C18185) c25227.generateLayoutParams(layoutParams);
                    abstractC11800.itemView.setLayoutParams(c18185);
                }
                c18185.f59428 = abstractC11800;
                if (z2 || !z4) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                c18185.f59426 = z5;
                return abstractC11800;
            }
            abstractC11800.mPreLayoutPosition = i;
            z4 = false;
            layoutParams = abstractC11800.itemView.getLayoutParams();
            if (layoutParams == null) {
                c18185 = (C18185) c25227.generateDefaultLayoutParams();
                abstractC11800.itemView.setLayoutParams(c18185);
            } else if (c25227.checkLayoutParams(layoutParams)) {
                c18185 = (C18185) c25227.generateLayoutParams(layoutParams);
                abstractC11800.itemView.setLayoutParams(c18185);
            } else {
                c18185 = (C18185) layoutParams;
            }
            c18185.f59428 = abstractC11800;
            if (z2) {
                z5 = false;
            } else {
                z5 = false;
            }
            c18185.f59426 = z5;
            return abstractC11800;
        }
        abstractC11800CreateViewHolder = null;
        arrayList = this.f8064;
        arrayList2 = this.f8070;
        if (abstractC11800CreateViewHolder == null) {
            size2 = arrayList.size();
            i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    abstractC11802 = (AbstractC11800) arrayList.get(i2);
                    if (abstractC11802.wasReturnedFromScrap()) {
                    }
                    i2++;
                } else {
                    arrayList4 = c25227.mChildHelper.f50473;
                    size3 = arrayList4.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size3) {
                            view3 = null;
                            break;
                        }
                        view3 = (View) arrayList4.get(i3);
                        abstractC11800M56274 = C25227.m56274(view3);
                        if (abstractC11800M56274.getLayoutPosition() != i) {
                        }
                        i3++;
                    }
                    if (view3 != null) {
                        size4 = arrayList2.size();
                        i4 = 0;
                        while (true) {
                            if (i4 < size4) {
                                abstractC11800CreateViewHolder = null;
                                break;
                            }
                            abstractC11802 = (AbstractC11800) arrayList2.get(i4);
                            if (abstractC11802.isInvalid()) {
                            }
                            i4++;
                        }
                    } else {
                        abstractC11800CreateViewHolder = C25227.m56274(view3);
                        c25227.mChildHelper.m37157(view3);
                        iM37159 = c25227.mChildHelper.m37159(view3);
                        if (iM37159 != -1) {
                            c25227.mChildHelper.m37151(iM37159);
                            m8427(view3);
                            abstractC11800CreateViewHolder.addFlags(8224);
                            break;
                        }
                        throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + abstractC11800CreateViewHolder + c25227.exceptionLabel());
                    }
                    if (abstractC11800CreateViewHolder != null) {
                        if (!abstractC11800CreateViewHolder.isRemoved()) {
                            i5 = abstractC11800CreateViewHolder.mPosition;
                            if (i5 >= 0) {
                            }
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC11800CreateViewHolder + c25227.exceptionLabel());
                        }
                        if (!C25227.sDebugAssertionsEnabled) {
                        }
                        z6 = c25227.mState.f50525;
                        if (z6) {
                            abstractC11800CreateViewHolder.addFlags(4);
                            if (abstractC11800CreateViewHolder.isScrap()) {
                                c25227.removeDetachedView(abstractC11800CreateViewHolder.itemView, false);
                                abstractC11800CreateViewHolder.unScrap();
                            } else if (abstractC11800CreateViewHolder.wasReturnedFromScrap()) {
                                abstractC11800CreateViewHolder.clearReturnedFromScrapFlag();
                            }
                            m8418(abstractC11800CreateViewHolder);
                            abstractC11800CreateViewHolder = null;
                        } else {
                            z = true;
                        }
                    }
                }
                abstractC11800CreateViewHolder = abstractC11802;
                if (abstractC11800CreateViewHolder != null) {
                    if (!abstractC11800CreateViewHolder.isRemoved()) {
                        i5 = abstractC11800CreateViewHolder.mPosition;
                        if (i5 >= 0) {
                        }
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC11800CreateViewHolder + c25227.exceptionLabel());
                    }
                    if (!C25227.sDebugAssertionsEnabled) {
                    }
                    z6 = c25227.mState.f50525;
                    if (z6) {
                        abstractC11800CreateViewHolder.addFlags(4);
                        if (abstractC11800CreateViewHolder.isScrap()) {
                            c25227.removeDetachedView(abstractC11800CreateViewHolder.itemView, false);
                            abstractC11800CreateViewHolder.unScrap();
                        } else if (abstractC11800CreateViewHolder.wasReturnedFromScrap()) {
                            abstractC11800CreateViewHolder.clearReturnedFromScrapFlag();
                        }
                        m8418(abstractC11800CreateViewHolder);
                        abstractC11800CreateViewHolder = null;
                    } else {
                        z = true;
                    }
                }
            }
        }
        if (abstractC11800CreateViewHolder == null) {
            iM50264 = c25227.mAdapterHelper.m50264(i, 0);
            if (iM50264 >= 0) {
            }
            StringBuilder sbM5128 = C1402.m5126("Inconsistency detected. Invalid item position ", i, "(offset:", ").state:", iM50264);
            sbM5128.append(c25227.mState.m37184());
            sbM5128.append(c25227.exceptionLabel());
            throw new IndexOutOfBoundsException(sbM5128.toString());
        }
        j2 = C25227.FOREVER_NS;
        z2 = z;
        abstractC11800 = abstractC11800CreateViewHolder;
        if (z2) {
            abstractC11800.setFlags(0, 8192);
            if (c25227.mState.f50528) {
                AbstractC3269.m10752(abstractC11800);
                AbstractC3269 abstractC32610 = c25227.mItemAnimator;
                abstractC11800.getUnmodifiedPayloads();
                abstractC32610.getClass();
                C23407 c23408 = new C23407();
                c23408.m52597(abstractC11800);
                c25227.recordAnimationInfoIfBouncedHiddenView(abstractC11800, c23408);
            }
        }
        if (c25227.mState.f50525) {
            if (abstractC11800.isBound()) {
                if (!C25227.sDebugAssertionsEnabled) {
                }
                int iM50267 = c25227.mAdapterHelper.m50264(i, 0);
                abstractC11800.mBindingAdapter = null;
                abstractC11800.mOwnerRecyclerView = c25227;
                int itemViewType3 = abstractC11800.getItemViewType();
                nanoTime = c25227.getNanoTime();
                if (j != j2) {
                }
                if (abstractC11800.isTmpDetached()) {
                    c25227.attachViewToParent(abstractC11800.itemView, c25227.getChildCount(), abstractC11800.itemView.getLayoutParams());
                    z3 = true;
                } else {
                    z3 = false;
                }
                c25227.mAdapter.bindViewHolder(abstractC11800, iM50267);
                if (z3) {
                    c25227.detachViewFromParent(abstractC11800.itemView);
                }
                this.f8071.m24423(abstractC11800.getItemViewType(), c25227.getNanoTime() - nanoTime);
                if (c25227.isAccessibilityEnabled()) {
                    view = abstractC11800.itemView;
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    c17767 = c25227.mAccessibilityDelegate;
                    if (c17767 != null) {
                        itemDelegate = c17767.getItemDelegate();
                        if (itemDelegate instanceof C17021) {
                            ((C17021) itemDelegate).m40119(view);
                        }
                        C22666.m51098(view, itemDelegate);
                    }
                }
                if (c25227.mState.f50525) {
                    abstractC11800.mPreLayoutPosition = i;
                }
                z4 = true;
            } else {
                if (!C25227.sDebugAssertionsEnabled) {
                }
                int iM50268 = c25227.mAdapterHelper.m50264(i, 0);
                abstractC11800.mBindingAdapter = null;
                abstractC11800.mOwnerRecyclerView = c25227;
                int itemViewType4 = abstractC11800.getItemViewType();
                nanoTime = c25227.getNanoTime();
                if (j != j2) {
                }
                if (abstractC11800.isTmpDetached()) {
                    c25227.attachViewToParent(abstractC11800.itemView, c25227.getChildCount(), abstractC11800.itemView.getLayoutParams());
                    z3 = true;
                } else {
                    z3 = false;
                }
                c25227.mAdapter.bindViewHolder(abstractC11800, iM50268);
                if (z3) {
                    c25227.detachViewFromParent(abstractC11800.itemView);
                }
                this.f8071.m24423(abstractC11800.getItemViewType(), c25227.getNanoTime() - nanoTime);
                if (c25227.isAccessibilityEnabled()) {
                    view = abstractC11800.itemView;
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    c17767 = c25227.mAccessibilityDelegate;
                    if (c17767 != null) {
                        itemDelegate = c17767.getItemDelegate();
                        if (itemDelegate instanceof C17021) {
                            ((C17021) itemDelegate).m40119(view);
                        }
                        C22666.m51098(view, itemDelegate);
                    }
                }
                if (c25227.mState.f50525) {
                    abstractC11800.mPreLayoutPosition = i;
                }
                z4 = true;
            }
        } else if (abstractC11800.isBound()) {
            if (!C25227.sDebugAssertionsEnabled) {
            }
            int iM50269 = c25227.mAdapterHelper.m50264(i, 0);
            abstractC11800.mBindingAdapter = null;
            abstractC11800.mOwnerRecyclerView = c25227;
            int itemViewType5 = abstractC11800.getItemViewType();
            nanoTime = c25227.getNanoTime();
            if (j != j2) {
            }
            if (abstractC11800.isTmpDetached()) {
                c25227.attachViewToParent(abstractC11800.itemView, c25227.getChildCount(), abstractC11800.itemView.getLayoutParams());
                z3 = true;
            } else {
                z3 = false;
            }
            c25227.mAdapter.bindViewHolder(abstractC11800, iM50269);
            if (z3) {
                c25227.detachViewFromParent(abstractC11800.itemView);
            }
            this.f8071.m24423(abstractC11800.getItemViewType(), c25227.getNanoTime() - nanoTime);
            if (c25227.isAccessibilityEnabled()) {
                view = abstractC11800.itemView;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                c17767 = c25227.mAccessibilityDelegate;
                if (c17767 != null) {
                    itemDelegate = c17767.getItemDelegate();
                    if (itemDelegate instanceof C17021) {
                        ((C17021) itemDelegate).m40119(view);
                    }
                    C22666.m51098(view, itemDelegate);
                }
            }
            if (c25227.mState.f50525) {
                abstractC11800.mPreLayoutPosition = i;
            }
            z4 = true;
        } else {
            if (!C25227.sDebugAssertionsEnabled) {
            }
            int iM502610 = c25227.mAdapterHelper.m50264(i, 0);
            abstractC11800.mBindingAdapter = null;
            abstractC11800.mOwnerRecyclerView = c25227;
            int itemViewType6 = abstractC11800.getItemViewType();
            nanoTime = c25227.getNanoTime();
            if (j != j2) {
            }
            if (abstractC11800.isTmpDetached()) {
                c25227.attachViewToParent(abstractC11800.itemView, c25227.getChildCount(), abstractC11800.itemView.getLayoutParams());
                z3 = true;
            } else {
                z3 = false;
            }
            c25227.mAdapter.bindViewHolder(abstractC11800, iM502610);
            if (z3) {
                c25227.detachViewFromParent(abstractC11800.itemView);
            }
            this.f8071.m24423(abstractC11800.getItemViewType(), c25227.getNanoTime() - nanoTime);
            if (c25227.isAccessibilityEnabled()) {
                view = abstractC11800.itemView;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                c17767 = c25227.mAccessibilityDelegate;
                if (c17767 != null) {
                    itemDelegate = c17767.getItemDelegate();
                    if (itemDelegate instanceof C17021) {
                        ((C17021) itemDelegate).m40119(view);
                    }
                    C22666.m51098(view, itemDelegate);
                }
            }
            if (c25227.mState.f50525) {
                abstractC11800.mPreLayoutPosition = i;
            }
            z4 = true;
        }
        layoutParams = abstractC11800.itemView.getLayoutParams();
        if (layoutParams == null) {
            c18185 = (C18185) c25227.generateDefaultLayoutParams();
            abstractC11800.itemView.setLayoutParams(c18185);
        } else if (c25227.checkLayoutParams(layoutParams)) {
            c18185 = (C18185) c25227.generateLayoutParams(layoutParams);
            abstractC11800.itemView.setLayoutParams(c18185);
        } else {
            c18185 = (C18185) layoutParams;
        }
        c18185.f59428 = abstractC11800;
        if (z2) {
            z5 = false;
        } else {
            z5 = false;
        }
        c18185.f59426 = z5;
        return abstractC11800;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8410(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                m8410((ViewGroup) childAt, true);
            }
        }
        if (z) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8416(View view) {
        AbstractC11800 abstractC11800M56274 = C25227.m56274(view);
        boolean zIsTmpDetached = abstractC11800M56274.isTmpDetached();
        C25227 c25227 = this.f8065;
        if (zIsTmpDetached) {
            c25227.removeDetachedView(view, false);
        }
        if (abstractC11800M56274.isScrap()) {
            abstractC11800M56274.unScrap();
        } else if (abstractC11800M56274.wasReturnedFromScrap()) {
            abstractC11800M56274.clearReturnedFromScrapFlag();
        }
        m8418(abstractC11800M56274);
        if (c25227.mItemAnimator == null || abstractC11800M56274.isRecyclable()) {
            return;
        }
        c25227.mItemAnimator.mo10767(abstractC11800M56274);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m8424() {
        ArrayList arrayList = this.f8070;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                m8422(size);
            }
        }
        arrayList.clear();
        if (C25227.ALLOW_THREAD_GAP_WORK) {
            C7304 c7304 = this.f8065.mPrefetchRegistry;
            int[] iArr = c7304.f24042;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c7304.f24040 = 0;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m8422(int i) {
        int i2 = C25227.HORIZONTAL;
        ArrayList arrayList = this.f8070;
        AbstractC11800 abstractC11800 = (AbstractC11800) arrayList.get(i);
        if (C25227.sVerboseLoggingEnabled) {
            C17359.toString(abstractC11800);
        }
        m8419(abstractC11800, true);
        arrayList.remove(i);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c7 A[LOOP:2: B:56:0x00be->B:60:0x00c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ca A[EDGE_INSN: B:84:0x00ca->B:61:0x00ca BREAK  A[LOOP:1: B:51:0x00a7->B:88:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ca A[EDGE_INSN: B:85:0x00ca->B:61:0x00ca BREAK  A[LOOP:1: B:51:0x00a7->B:88:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00ca A[EDGE_INSN: B:86:0x00ca->B:61:0x00ca BREAK  A[LOOP:1: B:51:0x00a7->B:88:?, LOOP_LABEL: LOOP:1: B:51:0x00a7->B:88:?], SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8418(AbstractC11800 abstractC11800) {
        int i;
        C7304 c7304;
        int i2;
        int i3;
        boolean zIsScrap = abstractC11800.isScrap();
        boolean z = false;
        boolean z2 = true;
        C25227 c25227 = this.f8065;
        if (zIsScrap || abstractC11800.itemView.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC11800.isScrap());
            sb.append(" isAttached:");
            sb.append(abstractC11800.itemView.getParent() != null);
            sb.append(c25227.exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC11800.isTmpDetached()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC11800 + c25227.exceptionLabel());
        }
        if (abstractC11800.shouldIgnore()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + c25227.exceptionLabel());
        }
        boolean zDoesTransientStatePreventRecycling = abstractC11800.doesTransientStatePreventRecycling();
        AbstractC12964 abstractC12964 = c25227.mAdapter;
        boolean z3 = abstractC12964 != null && zDoesTransientStatePreventRecycling && abstractC12964.onFailedToRecycleView(abstractC11800);
        boolean z4 = C25227.sDebugAssertionsEnabled;
        ArrayList arrayList = this.f8070;
        if (z4 && arrayList.contains(abstractC11800)) {
            throw new IllegalArgumentException("cached view received recycle internal? " + abstractC11800 + c25227.exceptionLabel());
        }
        if (z3 || abstractC11800.isRecyclable()) {
            if (this.f8067 <= 0 || abstractC11800.hasAnyOfTheFlags(526)) {
                z = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f8067 && size > 0) {
                    m8422(0);
                    size--;
                }
                if (C25227.ALLOW_THREAD_GAP_WORK && size > 0) {
                    C7304 c7305 = c25227.mPrefetchRegistry;
                    int i4 = abstractC11800.mPosition;
                    if (c7305.f24042 != null) {
                        int i5 = c7305.f24040 * 2;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                loop1: while (true) {
                                    size--;
                                    if (size >= 0) {
                                        break;
                                    }
                                    i = ((AbstractC11800) arrayList.get(size)).mPosition;
                                    c7304 = c25227.mPrefetchRegistry;
                                    if (c7304.f24042 != null) {
                                        break;
                                    }
                                    i2 = c7304.f24040 * 2;
                                    i3 = 0;
                                    while (true) {
                                        if (i3 < i2) {
                                            break loop1;
                                        } else if (c7304.f24042[i3] == i) {
                                            break;
                                        } else {
                                            i3 += 2;
                                        }
                                    }
                                }
                                size++;
                            } else if (c7305.f24042[i6] != i4) {
                                i6 += 2;
                            }
                        }
                    } else {
                        loop1: while (true) {
                            size--;
                            if (size >= 0) {
                                break;
                                break;
                            }
                            i = ((AbstractC11800) arrayList.get(size)).mPosition;
                            c7304 = c25227.mPrefetchRegistry;
                            if (c7304.f24042 != null) {
                                break;
                                break;
                            }
                            i2 = c7304.f24040 * 2;
                            i3 = 0;
                            while (true) {
                                if (i3 < i2) {
                                    break loop1;
                                    break loop1;
                                } else if (c7304.f24042[i3] == i) {
                                    break;
                                } else {
                                    i3 += 2;
                                }
                            }
                        }
                        size++;
                    }
                }
                arrayList.add(size, abstractC11800);
                z = true;
            }
            if (!z) {
                m8419(abstractC11800, true);
            }
            c25227.mViewInfoStore.m34205(abstractC11800);
            if (z && !z2 && zDoesTransientStatePreventRecycling) {
                C9880.m25687(abstractC11800.itemView);
                abstractC11800.mBindingAdapter = null;
                abstractC11800.mOwnerRecyclerView = null;
                return;
            }
            return;
        }
        if (C25227.sVerboseLoggingEnabled) {
            c25227.exceptionLabel();
        }
        z2 = false;
        c25227.mViewInfoStore.m34205(abstractC11800);
        if (z) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8419(AbstractC11800 abstractC11800, boolean z) {
        C25227.m56277(abstractC11800);
        View view = abstractC11800.itemView;
        C25227 c25227 = this.f8065;
        C17767 c17767 = c25227.mAccessibilityDelegate;
        if (c17767 != null) {
            C22687 itemDelegate = c17767.getItemDelegate();
            C22666.m51098(view, itemDelegate instanceof C17021 ? ((C17021) itemDelegate).m40120(view) : null);
        }
        if (z) {
            InterfaceC8489 interfaceC8489 = c25227.mRecyclerListener;
            if (interfaceC8489 != null) {
                interfaceC8489.m22810();
            }
            int size = c25227.mRecyclerListeners.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC8489) c25227.mRecyclerListeners.get(i)).m22810();
            }
            AbstractC12964 abstractC12964 = c25227.mAdapter;
            if (abstractC12964 != null) {
                abstractC12964.onViewRecycled(abstractC11800);
            }
            if (c25227.mState != null) {
                c25227.mViewInfoStore.m34205(abstractC11800);
            }
            if (C25227.sVerboseLoggingEnabled) {
                C17359.toString(abstractC11800);
            }
        }
        abstractC11800.mBindingAdapter = null;
        abstractC11800.mOwnerRecyclerView = null;
        m8414().m24424(abstractC11800);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8427(View view) {
        AbstractC11800 abstractC11800M56274 = C25227.m56274(view);
        boolean zHasAnyOfTheFlags = abstractC11800M56274.hasAnyOfTheFlags(12);
        C25227 c25227 = this.f8065;
        if (zHasAnyOfTheFlags || !abstractC11800M56274.isUpdated() || c25227.canReuseUpdatedViewHolder(abstractC11800M56274)) {
            if (abstractC11800M56274.isInvalid() && !abstractC11800M56274.isRemoved() && !c25227.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + c25227.exceptionLabel());
            }
            abstractC11800M56274.setScrapContainer(this, false);
            this.f8064.add(abstractC11800M56274);
            return;
        }
        if (this.f8066 == null) {
            this.f8066 = new ArrayList();
        }
        abstractC11800M56274.setScrapContainer(this, true);
        this.f8066.add(abstractC11800M56274);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8428(AbstractC11800 abstractC11800) {
        if (abstractC11800.mInChangeScrap) {
            this.f8066.remove(abstractC11800);
        } else {
            this.f8064.remove(abstractC11800);
        }
        abstractC11800.mScrapContainer = null;
        abstractC11800.mInChangeScrap = false;
        abstractC11800.clearReturnedFromScrapFlag();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8417(C9234 c9234) {
        C25227 c25227 = this.f8065;
        m8411(c25227.mAdapter, false);
        C9234 c9235 = this.f8071;
        if (c9235 != null) {
            c9235.f30072--;
        }
        this.f8071 = c9234;
        if (c9234 != null && c25227.getAdapter() != null) {
            this.f8071.f30072++;
        }
        m8412();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m8412() {
        if (this.f8071 != null) {
            C25227 c25227 = this.f8065;
            if (c25227.mAdapter == null || !c25227.isAttachedToWindow()) {
                return;
            }
            C9234 c9234 = this.f8071;
            c9234.f30074.add(c25227.mAdapter);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8411(AbstractC12964 abstractC12964, boolean z) {
        C9234 c9234 = this.f8071;
        if (c9234 != null) {
            SparseArray sparseArray = c9234.f30073;
            Set set = c9234.f30074;
            set.remove(abstractC12964);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((C1032) sparseArray.get(sparseArray.keyAt(i))).f3746;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    C9880.m25687(((AbstractC11800) arrayList.get(i2)).itemView);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m8421() {
        m8412();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m8429() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f8070;
            if (i >= arrayList.size()) {
                m8411(this.f8065.mAdapter, false);
                return;
            } else {
                C9880.m25687(((AbstractC11800) arrayList.get(i)).itemView);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9234 m8414() {
        if (this.f8071 == null) {
            C9234 c9234 = new C9234();
            c9234.f30073 = new SparseArray();
            c9234.f30072 = 0;
            c9234.f30074 = Collections.newSetFromMap(new IdentityHashMap());
            this.f8071 = c9234;
            m8412();
        }
        return this.f8071;
    }
}
