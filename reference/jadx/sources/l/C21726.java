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

/* JADX INFO: renamed from: l.᩸ܿܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21726 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f70434;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C15377 f70435;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f70436;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f70437;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f70438;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17492 f70439;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f70440;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List f70441;

    public C21726(C17492 c17492) {
        this.f70439 = c17492;
        ArrayList arrayList = new ArrayList();
        this.f70436 = arrayList;
        this.f70438 = null;
        this.f70440 = new ArrayList();
        this.f70441 = C0561.unmodifiableList(arrayList);
        this.f70437 = 2;
        this.f70434 = 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48478(AbstractC0414 abstractC0414, AbstractC0414 abstractC0415, boolean z) {
        this.f70436.clear();
        m48482();
        m48471(abstractC0414, true);
        C15377 c15377M48476 = m48476();
        if (abstractC0414 != null) {
            c15377M48476.f50071--;
        }
        if (!z && c15377M48476.f50071 == 0) {
            SparseArray sparseArray = c15377M48476.f50072;
            for (int i = 0; i < sparseArray.size(); i++) {
                C23138 c23138 = (C23138) sparseArray.valueAt(i);
                Iterator it = c23138.f75131.iterator();
                while (it.hasNext()) {
                    C10763.m27066(((AbstractC12554) it.next()).itemView);
                }
                c23138.f75131.clear();
            }
        }
        if (abstractC0415 != null) {
            c15377M48476.f50071++;
        } else {
            c15377M48476.getClass();
        }
        m48469();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m48473(int i) {
        this.f70437 = i;
        m48489();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m48489() {
        AbstractC5498 abstractC5498 = this.f70439.mLayout;
        this.f70434 = this.f70437 + (abstractC5498 != null ? abstractC5498.mPrefetchMaxCountObserved : 0);
        ArrayList arrayList = this.f70440;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || arrayList.size() <= this.f70434) {
                return;
            } else {
                m48484(size);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m48486() {
        return this.f70441;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m48474(int i) {
        C17492 c17492 = this.f70439;
        if (i >= 0 && i < c17492.mState.m38108()) {
            return !c17492.mState.f52015 ? i : c17492.mAdapterHelper.m25157(i, 0);
        }
        StringBuilder sbM40153 = C17214.m40153(i, "invalid position ", ". State item count is ");
        sbM40153.append(c17492.mState.m38108());
        sbM40153.append(c17492.exceptionLabel());
        throw new IndexOutOfBoundsException(sbM40153.toString());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View m48485(int i) {
        return m48475(i, C17492.FOREVER_NS).itemView;
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
    /* JADX WARN: Code duplicated, block: B:241:0x0458  */
    /* JADX WARN: Code duplicated, block: B:242:0x045d  */
    /* JADX WARN: Code duplicated, block: B:246:0x0463  */
    /* JADX WARN: Code duplicated, block: B:248:0x046b  */
    /* JADX WARN: Code duplicated, block: B:250:0x0475  */
    /* JADX WARN: Code duplicated, block: B:253:0x047c  */
    /* JADX WARN: Code duplicated, block: B:257:0x0487  */
    /* JADX WARN: Code duplicated, block: B:258:0x0493  */
    /* JADX WARN: Code duplicated, block: B:260:0x0499  */
    /* JADX WARN: Code duplicated, block: B:261:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:264:0x04ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:266:0x04af  */
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
    public final AbstractC12554 m48475(int i, long j) {
        AbstractC12554 abstractC12554CreateViewHolder;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j2;
        boolean z2;
        AbstractC12554 abstractC12554;
        long nanoTime;
        boolean z3;
        boolean z4;
        View view;
        C11143 c11143;
        C12025 itemDelegate;
        ViewGroup.LayoutParams layoutParams;
        C22432 c22432;
        boolean z5;
        int iM25157;
        long nanoTime2;
        C17492 c17492M40714;
        C23138 c23138;
        AbstractC12554 abstractC12555;
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
        AbstractC12554 abstractC12556;
        int iM45071;
        AbstractC12554 abstractC12554M40745;
        int i5;
        boolean z6;
        int size5;
        int iM25158;
        C17492 c17492 = this.f70439;
        if (i < 0 || i >= c17492.mState.m38108()) {
            StringBuilder sbM2791 = C0589.m2791("Invalid item position ", i, MotionUtils.EASING_TYPE_FORMAT_START, "). Item count:", i);
            sbM2791.append(c17492.mState.m38108());
            sbM2791.append(c17492.exceptionLabel());
            throw new IndexOutOfBoundsException(sbM2791.toString());
        }
        if (c17492.mState.f52015) {
            ArrayList arrayList5 = this.f70438;
            if (arrayList5 != null && (size5 = arrayList5.size()) != 0) {
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        if (c17492.mAdapter.hasStableIds() && (iM25158 = c17492.mAdapterHelper.m25157(i, 0)) > 0 && iM25158 < c17492.mAdapter.getItemCount()) {
                            long itemId = c17492.mAdapter.getItemId(iM25158);
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size5) {
                                    abstractC12554CreateViewHolder = null;
                                    break;
                                }
                                AbstractC12554 abstractC12557 = (AbstractC12554) this.f70438.get(i7);
                                if (!abstractC12557.wasReturnedFromScrap() && abstractC12557.getItemId() == itemId) {
                                    abstractC12557.addFlags(32);
                                    abstractC12554CreateViewHolder = abstractC12557;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            abstractC12554CreateViewHolder = null;
                            break;
                        }
                    } else {
                        abstractC12554CreateViewHolder = (AbstractC12554) this.f70438.get(i6);
                        if (!abstractC12554CreateViewHolder.wasReturnedFromScrap() && abstractC12554CreateViewHolder.getLayoutPosition() == i) {
                            abstractC12554CreateViewHolder.addFlags(32);
                            break;
                        }
                        i6++;
                    }
                }
            } else {
                abstractC12554CreateViewHolder = null;
                break;
            }
            z = abstractC12554CreateViewHolder != null;
            arrayList = this.f70436;
            arrayList2 = this.f70440;
            if (abstractC12554CreateViewHolder == null) {
                size2 = arrayList.size();
                i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        arrayList4 = c17492.mChildHelper.f63624;
                        size3 = arrayList4.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size3) {
                                view3 = null;
                                break;
                            }
                            view3 = (View) arrayList4.get(i3);
                            abstractC12554M40745 = C17492.m40745(view3);
                            if (abstractC12554M40745.getLayoutPosition() != i && !abstractC12554M40745.isInvalid() && !abstractC12554M40745.isRemoved()) {
                                break;
                            }
                            i3++;
                        }
                        if (view3 != null) {
                            size4 = arrayList2.size();
                            i4 = 0;
                            while (true) {
                                if (i4 < size4) {
                                    abstractC12554CreateViewHolder = null;
                                    break;
                                }
                                abstractC12556 = (AbstractC12554) arrayList2.get(i4);
                                if (abstractC12556.isInvalid() && abstractC12556.getLayoutPosition() == i && !abstractC12556.isAttachedToTransitionOverlay()) {
                                    arrayList2.remove(i4);
                                    if (C17492.sVerboseLoggingEnabled) {
                                        abstractC12556.toString();
                                    }
                                } else {
                                    i4++;
                                }
                            }
                        } else {
                            abstractC12554CreateViewHolder = C17492.m40745(view3);
                            c17492.mChildHelper.m45067(view3);
                            iM45071 = c17492.mChildHelper.m45071(view3);
                            if (iM45071 != -1) {
                                c17492.mChildHelper.m45063(iM45071);
                                m48487(view3);
                                abstractC12554CreateViewHolder.addFlags(8224);
                                break;
                            }
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + abstractC12554CreateViewHolder + c17492.exceptionLabel());
                        }
                    } else {
                        abstractC12556 = (AbstractC12554) arrayList.get(i2);
                        if (!abstractC12556.wasReturnedFromScrap() || abstractC12556.getLayoutPosition() != i || abstractC12556.isInvalid() || (!c17492.mState.f52015 && abstractC12556.isRemoved())) {
                            i2++;
                        } else {
                            abstractC12556.addFlags(32);
                        }
                    }
                    abstractC12554CreateViewHolder = abstractC12556;
                    break;
                }
                if (abstractC12554CreateViewHolder != null) {
                    if (!abstractC12554CreateViewHolder.isRemoved()) {
                        i5 = abstractC12554CreateViewHolder.mPosition;
                        if (i5 >= 0 || i5 >= c17492.mAdapter.getItemCount()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC12554CreateViewHolder + c17492.exceptionLabel());
                        }
                        z6 = (c17492.mState.f52015 || c17492.mAdapter.getItemViewType(abstractC12554CreateViewHolder.mPosition) == abstractC12554CreateViewHolder.getItemViewType()) && (!c17492.mAdapter.hasStableIds() || abstractC12554CreateViewHolder.getItemId() == c17492.mAdapter.getItemId(abstractC12554CreateViewHolder.mPosition));
                    } else {
                        if (!C17492.sDebugAssertionsEnabled && !c17492.mState.f52015) {
                            throw new IllegalStateException("should not receive a removed view unless it is pre layout" + c17492.exceptionLabel());
                        }
                        z6 = c17492.mState.f52015;
                    }
                    if (z6) {
                        z = true;
                    } else {
                        abstractC12554CreateViewHolder.addFlags(4);
                        if (abstractC12554CreateViewHolder.isScrap()) {
                            c17492.removeDetachedView(abstractC12554CreateViewHolder.itemView, false);
                            abstractC12554CreateViewHolder.unScrap();
                        } else if (abstractC12554CreateViewHolder.wasReturnedFromScrap()) {
                            abstractC12554CreateViewHolder.clearReturnedFromScrapFlag();
                        }
                        m48479(abstractC12554CreateViewHolder);
                        abstractC12554CreateViewHolder = null;
                    }
                }
            }
            if (abstractC12554CreateViewHolder == null) {
                iM25157 = c17492.mAdapterHelper.m25157(i, 0);
                if (iM25157 >= 0 || iM25157 >= c17492.mAdapter.getItemCount()) {
                    StringBuilder sbM2792 = C0589.m2791("Inconsistency detected. Invalid item position ", i, "(offset:", ").state:", iM25157);
                    sbM2792.append(c17492.mState.m38108());
                    sbM2792.append(c17492.exceptionLabel());
                    throw new IndexOutOfBoundsException(sbM2792.toString());
                }
                int itemViewType = c17492.mAdapter.getItemViewType(iM25157);
                if (c17492.mAdapter.hasStableIds()) {
                    long itemId2 = c17492.mAdapter.getItemId(iM25157);
                    int size6 = arrayList.size() - 1;
                    while (true) {
                        if (size6 < 0) {
                            j2 = C17492.FOREVER_NS;
                            int size7 = arrayList2.size() - 1;
                            while (true) {
                                if (size7 >= 0) {
                                    AbstractC12554 abstractC12558 = (AbstractC12554) arrayList2.get(size7);
                                    if (abstractC12558.getItemId() != itemId2 || abstractC12558.isAttachedToTransitionOverlay()) {
                                        size7--;
                                    } else {
                                        if (itemViewType == abstractC12558.getItemViewType()) {
                                            arrayList2.remove(size7);
                                            abstractC12554CreateViewHolder = abstractC12558;
                                            break;
                                        }
                                        m48484(size7);
                                    }
                                }
                                abstractC12554CreateViewHolder = null;
                                break;
                            }
                        }
                        Object obj = arrayList.get(size6);
                        j2 = C17492.FOREVER_NS;
                        AbstractC12554 abstractC12559 = (AbstractC12554) obj;
                        if (abstractC12559.getItemId() == itemId2 && !abstractC12559.wasReturnedFromScrap()) {
                            if (itemViewType == abstractC12559.getItemViewType()) {
                                abstractC12559.addFlags(32);
                                if (abstractC12559.isRemoved() && !c17492.mState.f52015) {
                                    abstractC12559.setFlags(2, 14);
                                }
                                abstractC12554CreateViewHolder = abstractC12559;
                                break;
                            }
                            arrayList.remove(size6);
                            c17492.removeDetachedView(abstractC12559.itemView, false);
                            AbstractC12554 abstractC12554M40746 = C17492.m40745(abstractC12559.itemView);
                            abstractC12554M40746.mScrapContainer = null;
                            abstractC12554M40746.mInChangeScrap = false;
                            abstractC12554M40746.clearReturnedFromScrapFlag();
                            m48479(abstractC12554M40746);
                        }
                        size6--;
                    }
                    if (abstractC12554CreateViewHolder != null) {
                        abstractC12554CreateViewHolder.mPosition = iM25157;
                        z2 = true;
                    }
                    if (abstractC12554CreateViewHolder == null) {
                        int i8 = C17492.HORIZONTAL;
                        c23138 = (C23138) m48476().f50072.get(itemViewType);
                        if (c23138 != null) {
                            abstractC12555 = null;
                            break;
                        }
                        arrayList3 = c23138.f75131;
                        if (arrayList3.isEmpty()) {
                            size = arrayList3.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    abstractC12555 = null;
                                    break;
                                }
                                if (!((AbstractC12554) arrayList3.get(size)).isAttachedToTransitionOverlay()) {
                                    abstractC12555 = (AbstractC12554) arrayList3.remove(size);
                                    break;
                                }
                                size--;
                            }
                        } else {
                            abstractC12555 = null;
                            break;
                        }
                        if (abstractC12555 != null) {
                            abstractC12555.resetInternal();
                            if (C17492.FORCE_INVALIDATE_DISPLAY_LIST) {
                                view2 = abstractC12555.itemView;
                                if (view2 instanceof ViewGroup) {
                                    m48470((ViewGroup) view2, false);
                                }
                            }
                        }
                        abstractC12554CreateViewHolder = abstractC12555;
                    }
                    if (abstractC12554CreateViewHolder == null) {
                        nanoTime2 = c17492.getNanoTime();
                        if (j == j2 && !this.f70435.m36816(nanoTime2, itemViewType, j)) {
                            return null;
                        }
                        abstractC12554CreateViewHolder = c17492.mAdapter.createViewHolder(c17492, itemViewType);
                        if (C17492.ALLOW_THREAD_GAP_WORK && (c17492M40714 = C17492.m40714(abstractC12554CreateViewHolder.itemView)) != null) {
                            abstractC12554CreateViewHolder.mNestedRecyclerView = new WeakReference(c17492M40714);
                        }
                        this.f70435.m36815(itemViewType, c17492.getNanoTime() - nanoTime2);
                    }
                } else {
                    j2 = C17492.FOREVER_NS;
                }
                z2 = z;
                if (abstractC12554CreateViewHolder == null) {
                    int i9 = C17492.HORIZONTAL;
                    c23138 = (C23138) m48476().f50072.get(itemViewType);
                    if (c23138 != null) {
                        abstractC12555 = null;
                        break;
                    }
                    arrayList3 = c23138.f75131;
                    if (arrayList3.isEmpty()) {
                        abstractC12555 = null;
                        break;
                    }
                    size = arrayList3.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            abstractC12555 = null;
                            break;
                        }
                        if (!((AbstractC12554) arrayList3.get(size)).isAttachedToTransitionOverlay()) {
                            abstractC12555 = (AbstractC12554) arrayList3.remove(size);
                            break;
                        }
                        size--;
                    }
                    if (abstractC12555 != null) {
                        abstractC12555.resetInternal();
                        if (C17492.FORCE_INVALIDATE_DISPLAY_LIST) {
                            view2 = abstractC12555.itemView;
                            if (view2 instanceof ViewGroup) {
                                m48470((ViewGroup) view2, false);
                            }
                        }
                    }
                    abstractC12554CreateViewHolder = abstractC12555;
                }
                if (abstractC12554CreateViewHolder == null) {
                    nanoTime2 = c17492.getNanoTime();
                    if (j == j2) {
                    }
                    abstractC12554CreateViewHolder = c17492.mAdapter.createViewHolder(c17492, itemViewType);
                    if (C17492.ALLOW_THREAD_GAP_WORK) {
                        abstractC12554CreateViewHolder.mNestedRecyclerView = new WeakReference(c17492M40714);
                    }
                    this.f70435.m36815(itemViewType, c17492.getNanoTime() - nanoTime2);
                }
            } else {
                j2 = C17492.FOREVER_NS;
                z2 = z;
            }
            abstractC12554 = abstractC12554CreateViewHolder;
            if (z2 && !c17492.mState.f52015 && abstractC12554.hasAnyOfTheFlags(8192)) {
                abstractC12554.setFlags(0, 8192);
                if (c17492.mState.f52024) {
                    AbstractC1825.m5949(abstractC12554);
                    AbstractC1825 abstractC1825 = c17492.mItemAnimator;
                    abstractC12554.getUnmodifiedPayloads();
                    abstractC1825.getClass();
                    C14527 c14527 = new C14527();
                    c14527.m34967(abstractC12554);
                    c17492.recordAnimationInfoIfBouncedHiddenView(abstractC12554, c14527);
                }
            }
            if (c17492.mState.f52015 || !abstractC12554.isBound()) {
                if (abstractC12554.isBound() || abstractC12554.needsUpdate() || abstractC12554.isInvalid()) {
                    if (!C17492.sDebugAssertionsEnabled && abstractC12554.isRemoved()) {
                        throw new IllegalStateException("Removed holder should be bound and it should come here only in pre-layout. Holder: " + abstractC12554 + c17492.exceptionLabel());
                    }
                    int iM25159 = c17492.mAdapterHelper.m25157(i, 0);
                    abstractC12554.mBindingAdapter = null;
                    abstractC12554.mOwnerRecyclerView = c17492;
                    int itemViewType2 = abstractC12554.getItemViewType();
                    nanoTime = c17492.getNanoTime();
                    if (j != j2 || this.f70435.m36814(nanoTime, itemViewType2, j)) {
                        if (abstractC12554.isTmpDetached()) {
                            c17492.attachViewToParent(abstractC12554.itemView, c17492.getChildCount(), abstractC12554.itemView.getLayoutParams());
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c17492.mAdapter.bindViewHolder(abstractC12554, iM25159);
                        if (z3) {
                            c17492.detachViewFromParent(abstractC12554.itemView);
                        }
                        this.f70435.m36812(abstractC12554.getItemViewType(), c17492.getNanoTime() - nanoTime);
                        if (c17492.isAccessibilityEnabled()) {
                            view = abstractC12554.itemView;
                            int i10 = C5031.f17539;
                            if (view.getImportantForAccessibility() == 0) {
                                view.setImportantForAccessibility(1);
                            }
                            c11143 = c17492.mAccessibilityDelegate;
                            if (c11143 != null) {
                                itemDelegate = c11143.getItemDelegate();
                                if (itemDelegate instanceof C6203) {
                                    ((C6203) itemDelegate).m17207(view);
                                }
                                C5031.m13990(view, itemDelegate);
                            }
                        }
                        if (c17492.mState.f52015) {
                            abstractC12554.mPreLayoutPosition = i;
                        }
                        z4 = true;
                    }
                }
                layoutParams = abstractC12554.itemView.getLayoutParams();
                if (layoutParams == null) {
                    c22432 = (C22432) c17492.generateDefaultLayoutParams();
                    abstractC12554.itemView.setLayoutParams(c22432);
                } else if (c17492.checkLayoutParams(layoutParams)) {
                    c22432 = (C22432) layoutParams;
                } else {
                    c22432 = (C22432) c17492.generateLayoutParams(layoutParams);
                    abstractC12554.itemView.setLayoutParams(c22432);
                }
                c22432.f73212 = abstractC12554;
                if (z2 || !z4) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                c22432.f73214 = z5;
                return abstractC12554;
            }
            abstractC12554.mPreLayoutPosition = i;
            z4 = false;
            layoutParams = abstractC12554.itemView.getLayoutParams();
            if (layoutParams == null) {
                c22432 = (C22432) c17492.generateDefaultLayoutParams();
                abstractC12554.itemView.setLayoutParams(c22432);
            } else if (c17492.checkLayoutParams(layoutParams)) {
                c22432 = (C22432) c17492.generateLayoutParams(layoutParams);
                abstractC12554.itemView.setLayoutParams(c22432);
            } else {
                c22432 = (C22432) layoutParams;
            }
            c22432.f73212 = abstractC12554;
            if (z2) {
                z5 = false;
            } else {
                z5 = false;
            }
            c22432.f73214 = z5;
            return abstractC12554;
        }
        abstractC12554CreateViewHolder = null;
        arrayList = this.f70436;
        arrayList2 = this.f70440;
        if (abstractC12554CreateViewHolder == null) {
            size2 = arrayList.size();
            i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    abstractC12556 = (AbstractC12554) arrayList.get(i2);
                    if (abstractC12556.wasReturnedFromScrap()) {
                    }
                    i2++;
                } else {
                    arrayList4 = c17492.mChildHelper.f63624;
                    size3 = arrayList4.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size3) {
                            view3 = null;
                            break;
                        }
                        view3 = (View) arrayList4.get(i3);
                        abstractC12554M40745 = C17492.m40745(view3);
                        if (abstractC12554M40745.getLayoutPosition() != i) {
                        }
                        i3++;
                    }
                    if (view3 != null) {
                        size4 = arrayList2.size();
                        i4 = 0;
                        while (true) {
                            if (i4 < size4) {
                                abstractC12554CreateViewHolder = null;
                                break;
                            }
                            abstractC12556 = (AbstractC12554) arrayList2.get(i4);
                            if (abstractC12556.isInvalid()) {
                            }
                            i4++;
                        }
                    } else {
                        abstractC12554CreateViewHolder = C17492.m40745(view3);
                        c17492.mChildHelper.m45067(view3);
                        iM45071 = c17492.mChildHelper.m45071(view3);
                        if (iM45071 != -1) {
                            c17492.mChildHelper.m45063(iM45071);
                            m48487(view3);
                            abstractC12554CreateViewHolder.addFlags(8224);
                            break;
                        }
                        throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + abstractC12554CreateViewHolder + c17492.exceptionLabel());
                    }
                    if (abstractC12554CreateViewHolder != null) {
                        if (!abstractC12554CreateViewHolder.isRemoved()) {
                            i5 = abstractC12554CreateViewHolder.mPosition;
                            if (i5 >= 0) {
                            }
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC12554CreateViewHolder + c17492.exceptionLabel());
                        }
                        if (!C17492.sDebugAssertionsEnabled) {
                        }
                        z6 = c17492.mState.f52015;
                        if (z6) {
                            abstractC12554CreateViewHolder.addFlags(4);
                            if (abstractC12554CreateViewHolder.isScrap()) {
                                c17492.removeDetachedView(abstractC12554CreateViewHolder.itemView, false);
                                abstractC12554CreateViewHolder.unScrap();
                            } else if (abstractC12554CreateViewHolder.wasReturnedFromScrap()) {
                                abstractC12554CreateViewHolder.clearReturnedFromScrapFlag();
                            }
                            m48479(abstractC12554CreateViewHolder);
                            abstractC12554CreateViewHolder = null;
                        } else {
                            z = true;
                        }
                    }
                }
                abstractC12554CreateViewHolder = abstractC12556;
                if (abstractC12554CreateViewHolder != null) {
                    if (!abstractC12554CreateViewHolder.isRemoved()) {
                        i5 = abstractC12554CreateViewHolder.mPosition;
                        if (i5 >= 0) {
                        }
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC12554CreateViewHolder + c17492.exceptionLabel());
                    }
                    if (!C17492.sDebugAssertionsEnabled) {
                    }
                    z6 = c17492.mState.f52015;
                    if (z6) {
                        abstractC12554CreateViewHolder.addFlags(4);
                        if (abstractC12554CreateViewHolder.isScrap()) {
                            c17492.removeDetachedView(abstractC12554CreateViewHolder.itemView, false);
                            abstractC12554CreateViewHolder.unScrap();
                        } else if (abstractC12554CreateViewHolder.wasReturnedFromScrap()) {
                            abstractC12554CreateViewHolder.clearReturnedFromScrapFlag();
                        }
                        m48479(abstractC12554CreateViewHolder);
                        abstractC12554CreateViewHolder = null;
                    } else {
                        z = true;
                    }
                }
            }
        }
        if (abstractC12554CreateViewHolder == null) {
            iM25157 = c17492.mAdapterHelper.m25157(i, 0);
            if (iM25157 >= 0) {
            }
            StringBuilder sbM2793 = C0589.m2791("Inconsistency detected. Invalid item position ", i, "(offset:", ").state:", iM25157);
            sbM2793.append(c17492.mState.m38108());
            sbM2793.append(c17492.exceptionLabel());
            throw new IndexOutOfBoundsException(sbM2793.toString());
        }
        j2 = C17492.FOREVER_NS;
        z2 = z;
        abstractC12554 = abstractC12554CreateViewHolder;
        if (z2) {
            abstractC12554.setFlags(0, 8192);
            if (c17492.mState.f52024) {
                AbstractC1825.m5949(abstractC12554);
                AbstractC1825 abstractC1826 = c17492.mItemAnimator;
                abstractC12554.getUnmodifiedPayloads();
                abstractC1826.getClass();
                C14527 c14528 = new C14527();
                c14528.m34967(abstractC12554);
                c17492.recordAnimationInfoIfBouncedHiddenView(abstractC12554, c14528);
            }
        }
        if (c17492.mState.f52015) {
            if (abstractC12554.isBound()) {
                if (!C17492.sDebugAssertionsEnabled) {
                }
                int iM251510 = c17492.mAdapterHelper.m25157(i, 0);
                abstractC12554.mBindingAdapter = null;
                abstractC12554.mOwnerRecyclerView = c17492;
                int itemViewType3 = abstractC12554.getItemViewType();
                nanoTime = c17492.getNanoTime();
                if (j != j2) {
                }
                if (abstractC12554.isTmpDetached()) {
                    c17492.attachViewToParent(abstractC12554.itemView, c17492.getChildCount(), abstractC12554.itemView.getLayoutParams());
                    z3 = true;
                } else {
                    z3 = false;
                }
                c17492.mAdapter.bindViewHolder(abstractC12554, iM251510);
                if (z3) {
                    c17492.detachViewFromParent(abstractC12554.itemView);
                }
                this.f70435.m36812(abstractC12554.getItemViewType(), c17492.getNanoTime() - nanoTime);
                if (c17492.isAccessibilityEnabled()) {
                    view = abstractC12554.itemView;
                    int i11 = C5031.f17539;
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    c11143 = c17492.mAccessibilityDelegate;
                    if (c11143 != null) {
                        itemDelegate = c11143.getItemDelegate();
                        if (itemDelegate instanceof C6203) {
                            ((C6203) itemDelegate).m17207(view);
                        }
                        C5031.m13990(view, itemDelegate);
                    }
                }
                if (c17492.mState.f52015) {
                    abstractC12554.mPreLayoutPosition = i;
                }
                z4 = true;
            } else {
                if (!C17492.sDebugAssertionsEnabled) {
                }
                int iM251511 = c17492.mAdapterHelper.m25157(i, 0);
                abstractC12554.mBindingAdapter = null;
                abstractC12554.mOwnerRecyclerView = c17492;
                int itemViewType4 = abstractC12554.getItemViewType();
                nanoTime = c17492.getNanoTime();
                if (j != j2) {
                }
                if (abstractC12554.isTmpDetached()) {
                    c17492.attachViewToParent(abstractC12554.itemView, c17492.getChildCount(), abstractC12554.itemView.getLayoutParams());
                    z3 = true;
                } else {
                    z3 = false;
                }
                c17492.mAdapter.bindViewHolder(abstractC12554, iM251511);
                if (z3) {
                    c17492.detachViewFromParent(abstractC12554.itemView);
                }
                this.f70435.m36812(abstractC12554.getItemViewType(), c17492.getNanoTime() - nanoTime);
                if (c17492.isAccessibilityEnabled()) {
                    view = abstractC12554.itemView;
                    int i12 = C5031.f17539;
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    c11143 = c17492.mAccessibilityDelegate;
                    if (c11143 != null) {
                        itemDelegate = c11143.getItemDelegate();
                        if (itemDelegate instanceof C6203) {
                            ((C6203) itemDelegate).m17207(view);
                        }
                        C5031.m13990(view, itemDelegate);
                    }
                }
                if (c17492.mState.f52015) {
                    abstractC12554.mPreLayoutPosition = i;
                }
                z4 = true;
            }
        } else if (abstractC12554.isBound()) {
            if (!C17492.sDebugAssertionsEnabled) {
            }
            int iM251512 = c17492.mAdapterHelper.m25157(i, 0);
            abstractC12554.mBindingAdapter = null;
            abstractC12554.mOwnerRecyclerView = c17492;
            int itemViewType5 = abstractC12554.getItemViewType();
            nanoTime = c17492.getNanoTime();
            if (j != j2) {
            }
            if (abstractC12554.isTmpDetached()) {
                c17492.attachViewToParent(abstractC12554.itemView, c17492.getChildCount(), abstractC12554.itemView.getLayoutParams());
                z3 = true;
            } else {
                z3 = false;
            }
            c17492.mAdapter.bindViewHolder(abstractC12554, iM251512);
            if (z3) {
                c17492.detachViewFromParent(abstractC12554.itemView);
            }
            this.f70435.m36812(abstractC12554.getItemViewType(), c17492.getNanoTime() - nanoTime);
            if (c17492.isAccessibilityEnabled()) {
                view = abstractC12554.itemView;
                int i13 = C5031.f17539;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                c11143 = c17492.mAccessibilityDelegate;
                if (c11143 != null) {
                    itemDelegate = c11143.getItemDelegate();
                    if (itemDelegate instanceof C6203) {
                        ((C6203) itemDelegate).m17207(view);
                    }
                    C5031.m13990(view, itemDelegate);
                }
            }
            if (c17492.mState.f52015) {
                abstractC12554.mPreLayoutPosition = i;
            }
            z4 = true;
        } else {
            if (!C17492.sDebugAssertionsEnabled) {
            }
            int iM251513 = c17492.mAdapterHelper.m25157(i, 0);
            abstractC12554.mBindingAdapter = null;
            abstractC12554.mOwnerRecyclerView = c17492;
            int itemViewType6 = abstractC12554.getItemViewType();
            nanoTime = c17492.getNanoTime();
            if (j != j2) {
            }
            if (abstractC12554.isTmpDetached()) {
                c17492.attachViewToParent(abstractC12554.itemView, c17492.getChildCount(), abstractC12554.itemView.getLayoutParams());
                z3 = true;
            } else {
                z3 = false;
            }
            c17492.mAdapter.bindViewHolder(abstractC12554, iM251513);
            if (z3) {
                c17492.detachViewFromParent(abstractC12554.itemView);
            }
            this.f70435.m36812(abstractC12554.getItemViewType(), c17492.getNanoTime() - nanoTime);
            if (c17492.isAccessibilityEnabled()) {
                view = abstractC12554.itemView;
                int i14 = C5031.f17539;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                c11143 = c17492.mAccessibilityDelegate;
                if (c11143 != null) {
                    itemDelegate = c11143.getItemDelegate();
                    if (itemDelegate instanceof C6203) {
                        ((C6203) itemDelegate).m17207(view);
                    }
                    C5031.m13990(view, itemDelegate);
                }
            }
            if (c17492.mState.f52015) {
                abstractC12554.mPreLayoutPosition = i;
            }
            z4 = true;
        }
        layoutParams = abstractC12554.itemView.getLayoutParams();
        if (layoutParams == null) {
            c22432 = (C22432) c17492.generateDefaultLayoutParams();
            abstractC12554.itemView.setLayoutParams(c22432);
        } else if (c17492.checkLayoutParams(layoutParams)) {
            c22432 = (C22432) c17492.generateLayoutParams(layoutParams);
            abstractC12554.itemView.setLayoutParams(c22432);
        } else {
            c22432 = (C22432) layoutParams;
        }
        c22432.f73212 = abstractC12554;
        if (z2) {
            z5 = false;
        } else {
            z5 = false;
        }
        c22432.f73214 = z5;
        return abstractC12554;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48470(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                m48470((ViewGroup) childAt, true);
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
    public final void m48477(View view) {
        AbstractC12554 abstractC12554M40745 = C17492.m40745(view);
        boolean zIsTmpDetached = abstractC12554M40745.isTmpDetached();
        C17492 c17492 = this.f70439;
        if (zIsTmpDetached) {
            c17492.removeDetachedView(view, false);
        }
        if (abstractC12554M40745.isScrap()) {
            abstractC12554M40745.unScrap();
        } else if (abstractC12554M40745.wasReturnedFromScrap()) {
            abstractC12554M40745.clearReturnedFromScrapFlag();
        }
        m48479(abstractC12554M40745);
        if (c17492.mItemAnimator == null || abstractC12554M40745.isRecyclable()) {
            return;
        }
        c17492.mItemAnimator.mo5965(abstractC12554M40745);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m48482() {
        ArrayList arrayList = this.f70440;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                m48484(size);
            }
        }
        arrayList.clear();
        if (C17492.ALLOW_THREAD_GAP_WORK) {
            C8301 c8301 = this.f70439.mPrefetchRegistry;
            int[] iArr = c8301.f28824;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c8301.f28822 = 0;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m48484(int i) {
        int i2 = C17492.HORIZONTAL;
        ArrayList arrayList = this.f70440;
        AbstractC12554 abstractC12554 = (AbstractC12554) arrayList.get(i);
        if (C17492.sVerboseLoggingEnabled) {
            C13638.toString(abstractC12554);
        }
        m48480(abstractC12554, true);
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
    public final void m48479(AbstractC12554 abstractC12554) {
        int i;
        C8301 c8301;
        int i2;
        int i3;
        boolean zIsScrap = abstractC12554.isScrap();
        boolean z = false;
        boolean z2 = true;
        C17492 c17492 = this.f70439;
        if (zIsScrap || abstractC12554.itemView.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC12554.isScrap());
            sb.append(" isAttached:");
            sb.append(abstractC12554.itemView.getParent() != null);
            sb.append(c17492.exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC12554.isTmpDetached()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC12554 + c17492.exceptionLabel());
        }
        if (abstractC12554.shouldIgnore()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + c17492.exceptionLabel());
        }
        boolean zDoesTransientStatePreventRecycling = abstractC12554.doesTransientStatePreventRecycling();
        AbstractC0414 abstractC0414 = c17492.mAdapter;
        boolean z3 = abstractC0414 != null && zDoesTransientStatePreventRecycling && abstractC0414.onFailedToRecycleView(abstractC12554);
        boolean z4 = C17492.sDebugAssertionsEnabled;
        ArrayList arrayList = this.f70440;
        if (z4 && arrayList.contains(abstractC12554)) {
            throw new IllegalArgumentException("cached view received recycle internal? " + abstractC12554 + c17492.exceptionLabel());
        }
        if (z3 || abstractC12554.isRecyclable()) {
            if (this.f70434 <= 0 || abstractC12554.hasAnyOfTheFlags(526)) {
                z = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f70434 && size > 0) {
                    m48484(0);
                    size--;
                }
                if (C17492.ALLOW_THREAD_GAP_WORK && size > 0) {
                    C8301 c8302 = c17492.mPrefetchRegistry;
                    int i4 = abstractC12554.mPosition;
                    if (c8302.f28824 != null) {
                        int i5 = c8302.f28822 * 2;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                loop1: while (true) {
                                    size--;
                                    if (size >= 0) {
                                        break;
                                    }
                                    i = ((AbstractC12554) arrayList.get(size)).mPosition;
                                    c8301 = c17492.mPrefetchRegistry;
                                    if (c8301.f28824 != null) {
                                        break;
                                    }
                                    i2 = c8301.f28822 * 2;
                                    i3 = 0;
                                    while (true) {
                                        if (i3 < i2) {
                                            break loop1;
                                        } else if (c8301.f28824[i3] == i) {
                                            break;
                                        } else {
                                            i3 += 2;
                                        }
                                    }
                                }
                                size++;
                            } else if (c8302.f28824[i6] != i4) {
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
                            i = ((AbstractC12554) arrayList.get(size)).mPosition;
                            c8301 = c17492.mPrefetchRegistry;
                            if (c8301.f28824 != null) {
                                break;
                                break;
                            }
                            i2 = c8301.f28822 * 2;
                            i3 = 0;
                            while (true) {
                                if (i3 < i2) {
                                    break loop1;
                                    break loop1;
                                } else if (c8301.f28824[i3] == i) {
                                    break;
                                } else {
                                    i3 += 2;
                                }
                            }
                        }
                        size++;
                    }
                }
                arrayList.add(size, abstractC12554);
                z = true;
            }
            if (!z) {
                m48480(abstractC12554, true);
            }
            c17492.mViewInfoStore.m21049(abstractC12554);
            if (z && !z2 && zDoesTransientStatePreventRecycling) {
                C10763.m27066(abstractC12554.itemView);
                abstractC12554.mBindingAdapter = null;
                abstractC12554.mOwnerRecyclerView = null;
                return;
            }
            return;
        }
        if (C17492.sVerboseLoggingEnabled) {
            c17492.exceptionLabel();
        }
        z2 = false;
        c17492.mViewInfoStore.m21049(abstractC12554);
        if (z) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48480(AbstractC12554 abstractC12554, boolean z) {
        C17492.m40747(abstractC12554);
        View view = abstractC12554.itemView;
        C17492 c17492 = this.f70439;
        C11143 c11143 = c17492.mAccessibilityDelegate;
        if (c11143 != null) {
            C12025 itemDelegate = c11143.getItemDelegate();
            C5031.m13990(view, itemDelegate instanceof C6203 ? ((C6203) itemDelegate).m17208(view) : null);
        }
        if (z) {
            InterfaceC18198 interfaceC18198 = c17492.mRecyclerListener;
            if (interfaceC18198 != null) {
                interfaceC18198.m42315();
            }
            int size = c17492.mRecyclerListeners.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC18198) c17492.mRecyclerListeners.get(i)).m42315();
            }
            AbstractC0414 abstractC0414 = c17492.mAdapter;
            if (abstractC0414 != null) {
                abstractC0414.onViewRecycled(abstractC12554);
            }
            if (c17492.mState != null) {
                c17492.mViewInfoStore.m21049(abstractC12554);
            }
            if (C17492.sVerboseLoggingEnabled) {
                C13638.toString(abstractC12554);
            }
        }
        abstractC12554.mBindingAdapter = null;
        abstractC12554.mOwnerRecyclerView = null;
        m48476().m36813(abstractC12554);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48487(View view) {
        AbstractC12554 abstractC12554M40745 = C17492.m40745(view);
        boolean zHasAnyOfTheFlags = abstractC12554M40745.hasAnyOfTheFlags(12);
        C17492 c17492 = this.f70439;
        if (zHasAnyOfTheFlags || !abstractC12554M40745.isUpdated() || c17492.canReuseUpdatedViewHolder(abstractC12554M40745)) {
            if (abstractC12554M40745.isInvalid() && !abstractC12554M40745.isRemoved() && !c17492.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + c17492.exceptionLabel());
            }
            abstractC12554M40745.setScrapContainer(this, false);
            this.f70436.add(abstractC12554M40745);
            return;
        }
        if (this.f70438 == null) {
            this.f70438 = new ArrayList();
        }
        abstractC12554M40745.setScrapContainer(this, true);
        this.f70438.add(abstractC12554M40745);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48488(AbstractC12554 abstractC12554) {
        if (abstractC12554.mInChangeScrap) {
            this.f70438.remove(abstractC12554);
        } else {
            this.f70436.remove(abstractC12554);
        }
        abstractC12554.mScrapContainer = null;
        abstractC12554.mInChangeScrap = false;
        abstractC12554.clearReturnedFromScrapFlag();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48481(C15377 c15377) {
        C17492 c17492 = this.f70439;
        m48471(c17492.mAdapter, false);
        C15377 c15378 = this.f70435;
        if (c15378 != null) {
            c15378.f50071--;
        }
        this.f70435 = c15377;
        if (c15377 != null && c17492.getAdapter() != null) {
            this.f70435.f50071++;
        }
        m48469();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m48469() {
        if (this.f70435 != null) {
            C17492 c17492 = this.f70439;
            if (c17492.mAdapter == null || !c17492.isAttachedToWindow()) {
                return;
            }
            C15377 c15377 = this.f70435;
            c15377.f50073.add(c17492.mAdapter);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48471(AbstractC0414 abstractC0414, boolean z) {
        C15377 c15377 = this.f70435;
        if (c15377 != null) {
            SparseArray sparseArray = c15377.f50072;
            Set set = c15377.f50073;
            set.remove(abstractC0414);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((C23138) sparseArray.get(sparseArray.keyAt(i))).f75131;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    C10763.m27066(((AbstractC12554) arrayList.get(i2)).itemView);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m48483() {
        m48469();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m48472() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f70440;
            if (i >= arrayList.size()) {
                m48471(this.f70439.mAdapter, false);
                return;
            } else {
                C10763.m27066(((AbstractC12554) arrayList.get(i)).itemView);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15377 m48476() {
        if (this.f70435 == null) {
            C15377 c15377 = new C15377();
            c15377.f50072 = new SparseArray();
            c15377.f50071 = 0;
            c15377.f50073 = Collections.newSetFromMap(new IdentityHashMap());
            this.f70435 = c15377;
            m48469();
        }
        return this.f70435;
    }
}
