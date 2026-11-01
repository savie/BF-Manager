package l;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: l.֡۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0414 {
    public final C16643 mObservable = new C16643();
    public boolean mHasStableIds = false;
    public EnumC20171 mStateRestorationPolicy = EnumC20171.ALLOW;

    public int findRelativeAdapterPositionIn(AbstractC0414 abstractC0414, AbstractC12554 abstractC12554, int i) {
        if (abstractC0414 == this) {
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

    public void onAttachedToRecyclerView(C17492 c17492) {
    }

    public abstract void onBindViewHolder(AbstractC12554 abstractC12554, int i);

    public abstract AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i);

    public void onDetachedFromRecyclerView(C17492 c17492) {
    }

    public boolean onFailedToRecycleView(AbstractC12554 abstractC12554) {
        return false;
    }

    public void onViewAttachedToWindow(AbstractC12554 abstractC12554) {
    }

    public void onViewDetachedFromWindow(AbstractC12554 abstractC12554) {
    }

    public void onViewRecycled(AbstractC12554 abstractC12554) {
    }

    public void onBindViewHolder(AbstractC12554 abstractC12554, int i, List list) {
        onBindViewHolder(abstractC12554, i);
    }

    public final AbstractC12554 createViewHolder(ViewGroup viewGroup, int i) {
        try {
            int i2 = C8684.f29888;
            Trace.beginSection(C17492.TRACE_CREATE_VIEW_TAG);
            AbstractC12554 abstractC12554OnCreateViewHolder = onCreateViewHolder(viewGroup, i);
            if (abstractC12554OnCreateViewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            abstractC12554OnCreateViewHolder.mItemViewType = i;
            Trace.endSection();
            return abstractC12554OnCreateViewHolder;
        } catch (Throwable th) {
            int i3 = C8684.f29888;
            Trace.endSection();
            throw th;
        }
    }

    public final void bindViewHolder(AbstractC12554 abstractC12554, int i) {
        boolean z = abstractC12554.mBindingAdapter == null;
        if (z) {
            abstractC12554.mPosition = i;
            if (hasStableIds()) {
                abstractC12554.mItemId = getItemId(i);
            }
            abstractC12554.setFlags(1, 519);
            int i2 = C8684.f29888;
            Trace.beginSection(C17492.TRACE_BIND_VIEW_TAG);
        }
        abstractC12554.mBindingAdapter = this;
        if (C17492.sDebugAssertionsEnabled) {
            if (abstractC12554.itemView.getParent() == null) {
                View view = abstractC12554.itemView;
                int i3 = C5031.f17539;
                if (view.isAttachedToWindow() != abstractC12554.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + abstractC12554.isTmpDetached() + ", attached to window: " + abstractC12554.itemView.isAttachedToWindow() + ", holder: " + abstractC12554);
                }
            }
            if (abstractC12554.itemView.getParent() == null) {
                View view2 = abstractC12554.itemView;
                int i4 = C5031.f17539;
                if (view2.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + abstractC12554);
                }
            }
        }
        onBindViewHolder(abstractC12554, i, abstractC12554.getUnmodifiedPayloads());
        if (z) {
            abstractC12554.clearPayload();
            ViewGroup.LayoutParams layoutParams = abstractC12554.itemView.getLayoutParams();
            if (layoutParams instanceof C22432) {
                ((C22432) layoutParams).f73215 = true;
            }
            int i5 = C8684.f29888;
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
        return this.mObservable.m39109();
    }

    public void registerAdapterDataObserver(AbstractC12410 abstractC12410) {
        this.mObservable.registerObserver(abstractC12410);
    }

    public void unregisterAdapterDataObserver(AbstractC12410 abstractC12410) {
        this.mObservable.unregisterObserver(abstractC12410);
    }

    public final void notifyDataSetChanged() {
        this.mObservable.m39112();
    }

    public final void notifyItemChanged(int i) {
        this.mObservable.m39108(i, 1, null);
    }

    public final void notifyItemChanged(int i, Object obj) {
        this.mObservable.m39108(i, 1, obj);
    }

    public final void notifyItemRangeChanged(int i, int i2) {
        this.mObservable.m39108(i, i2, null);
    }

    public final void notifyItemRangeChanged(int i, int i2, Object obj) {
        this.mObservable.m39108(i, i2, obj);
    }

    public final void notifyItemInserted(int i) {
        this.mObservable.m39113(i, 1);
    }

    public final void notifyItemMoved(int i, int i2) {
        this.mObservable.m39107(i, i2);
    }

    public final void notifyItemRangeInserted(int i, int i2) {
        this.mObservable.m39113(i, i2);
    }

    public final void notifyItemRemoved(int i) {
        this.mObservable.m39111(i, 1);
    }

    public final void notifyItemRangeRemoved(int i, int i2) {
        this.mObservable.m39111(i, i2);
    }

    public void setStateRestorationPolicy(EnumC20171 enumC20171) {
        this.mStateRestorationPolicy = enumC20171;
        this.mObservable.m39110();
    }

    public final EnumC20171 getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public boolean canRestoreState() {
        int i = C15938.f51630[this.mStateRestorationPolicy.ordinal()];
        return i != 1 && (i != 2 || getItemCount() > 0);
    }
}
