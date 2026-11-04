package l;

import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: l.۫۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12964 {
    public final C5507 mObservable = new C5507();
    public boolean mHasStableIds = false;
    public EnumC15201 mStateRestorationPolicy = EnumC15201.ALLOW;

    public int findRelativeAdapterPositionIn(AbstractC12964 abstractC12964, AbstractC11800 abstractC11800, int i) {
        if (abstractC12964 == this) {
            return i;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i) {
        return -1L;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public void onAttachedToRecyclerView(C25227 c25227) {
    }

    public abstract void onBindViewHolder(AbstractC11800 abstractC11800, int i);

    public abstract AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i);

    public void onDetachedFromRecyclerView(C25227 c25227) {
    }

    public boolean onFailedToRecycleView(AbstractC11800 abstractC11800) {
        return false;
    }

    public void onViewAttachedToWindow(AbstractC11800 abstractC11800) {
    }

    public void onViewDetachedFromWindow(AbstractC11800 abstractC11800) {
    }

    public void onViewRecycled(AbstractC11800 abstractC11800) {
    }

    public void onBindViewHolder(AbstractC11800 abstractC11800, int i, List list) {
        onBindViewHolder(abstractC11800, i);
    }

    public final AbstractC11800 createViewHolder(ViewGroup viewGroup, int i) {
        try {
            if (C21217.m48373()) {
                Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i)));
            }
            AbstractC11800 abstractC11800OnCreateViewHolder = onCreateViewHolder(viewGroup, i);
            if (abstractC11800OnCreateViewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            abstractC11800OnCreateViewHolder.mItemViewType = i;
            Trace.endSection();
            return abstractC11800OnCreateViewHolder;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void bindViewHolder(AbstractC11800 abstractC11800, int i) {
        boolean z = abstractC11800.mBindingAdapter == null;
        if (z) {
            abstractC11800.mPosition = i;
            if (hasStableIds()) {
                abstractC11800.mItemId = getItemId(i);
            }
            abstractC11800.setFlags(1, 519);
            if (C21217.m48373()) {
                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(abstractC11800.mItemViewType)));
            }
        }
        abstractC11800.mBindingAdapter = this;
        if (C25227.sDebugAssertionsEnabled) {
            if (abstractC11800.itemView.getParent() == null && abstractC11800.itemView.isAttachedToWindow() != abstractC11800.isTmpDetached()) {
                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + abstractC11800.isTmpDetached() + ", attached to window: " + abstractC11800.itemView.isAttachedToWindow() + ", holder: " + abstractC11800);
            }
            if (abstractC11800.itemView.getParent() == null && abstractC11800.itemView.isAttachedToWindow()) {
                throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + abstractC11800);
            }
        }
        onBindViewHolder(abstractC11800, i, abstractC11800.getUnmodifiedPayloads());
        if (z) {
            abstractC11800.clearPayload();
            ViewGroup.LayoutParams layoutParams = abstractC11800.itemView.getLayoutParams();
            if (layoutParams instanceof C18185) {
                ((C18185) layoutParams).f59427 = true;
            }
            Trace.endSection();
        }
    }

    public void setHasStableIds(boolean z) {
        if (hasObservers()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.mHasStableIds = z;
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final boolean hasObservers() {
        return this.mObservable.m16375();
    }

    public void registerAdapterDataObserver(AbstractC1778 abstractC1778) {
        this.mObservable.registerObserver(abstractC1778);
    }

    public void unregisterAdapterDataObserver(AbstractC1778 abstractC1778) {
        this.mObservable.unregisterObserver(abstractC1778);
    }

    public final void notifyDataSetChanged() {
        this.mObservable.m16378();
    }

    public final void notifyItemChanged(int i) {
        this.mObservable.m16374(i, 1, null);
    }

    public final void notifyItemChanged(int i, Object obj) {
        this.mObservable.m16374(i, 1, obj);
    }

    public final void notifyItemRangeChanged(int i, int i2) {
        this.mObservable.m16374(i, i2, null);
    }

    public final void notifyItemRangeChanged(int i, int i2, Object obj) {
        this.mObservable.m16374(i, i2, obj);
    }

    public final void notifyItemInserted(int i) {
        this.mObservable.m16379(i, 1);
    }

    public final void notifyItemMoved(int i, int i2) {
        this.mObservable.m16373(i, i2);
    }

    public final void notifyItemRangeInserted(int i, int i2) {
        this.mObservable.m16379(i, i2);
    }

    public final void notifyItemRemoved(int i) {
        this.mObservable.m16377(i, 1);
    }

    public final void notifyItemRangeRemoved(int i, int i2) {
        this.mObservable.m16377(i, i2);
    }

    public void setStateRestorationPolicy(EnumC15201 enumC15201) {
        this.mStateRestorationPolicy = enumC15201;
        this.mObservable.m16376();
    }

    public final EnumC15201 getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public boolean canRestoreState() {
        int iOrdinal = this.mStateRestorationPolicy.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2;
        }
        return getItemCount() > 0;
    }
}
