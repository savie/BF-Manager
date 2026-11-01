package l;

import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: V7F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11546 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f38828;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC0414 f38829;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f38830;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f38831;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C4647 f38832;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6938 f38833;

    public C11546(C6938 c6938, int... iArr) {
        this.f38833 = c6938;
        this.f38831 = iArr;
        c6938.getMenu().findItem(R.id.MT_Protector).setIcon(R.drawable.MT_Protector);
        m28838(false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28841(AbstractC0414 abstractC0414) {
        this.f38829 = abstractC0414;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28842(C4647 c4647) {
        this.f38832 = c4647;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m28846() {
        return this.f38828;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m28845() {
        m28838(this.f38828, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28839() {
        if (this.f38828) {
            return;
        }
        this.f38828 = true;
        this.f38830 = SystemClock.uptimeMillis();
        AbstractC0414 abstractC0414 = this.f38829;
        if (abstractC0414 != null) {
            abstractC0414.notifyDataSetChanged();
        }
        m28838(true, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28844(boolean z) {
        if (this.f38828) {
            this.f38828 = false;
            this.f38830 = SystemClock.uptimeMillis();
            AbstractC0414 abstractC0414 = this.f38829;
            if (abstractC0414 != null) {
                abstractC0414.notifyDataSetChanged();
            }
            m28838(false, z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28840(ImageView imageView, boolean z) {
        imageView.animate().cancel();
        if (!z) {
            imageView.setVisibility(8);
            imageView.setAlpha(1.0f);
            return;
        }
        if (SystemClock.uptimeMillis() - this.f38830 >= 100) {
            imageView.setVisibility(this.f38828 ? 0 : 8);
            imageView.setAlpha(1.0f);
        } else if (this.f38828) {
            imageView.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.animate().alpha(1.0f).setDuration(200L);
        } else {
            imageView.setVisibility(0);
            imageView.animate().alpha(0.0f).setDuration(200L).withEndAction(new RunnableC23440(6, imageView));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28843(AbstractC12554 abstractC12554) {
        C4647 c4647;
        if (!this.f38828 || (c4647 = this.f38832) == null) {
            return;
        }
        c4647.m12830(abstractC12554);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28838(boolean z, boolean z2) {
        C6938 c6938 = this.f38833;
        Menu menu = c6938.getMenu();
        MenuItem menuItemFindItem = menu.findItem(R.id.MT_Protector);
        if (menuItemFindItem == null) {
            return;
        }
        ArrayList<MenuItem> arrayList = new ArrayList();
        for (int i : this.f38831) {
            MenuItem menuItemFindItem2 = menu.findItem(i);
            if (menuItemFindItem2 != null) {
                arrayList.add(menuItemFindItem2);
            }
        }
        if (z2) {
            final MenuItem[] menuItemArr = z ? (MenuItem[]) arrayList.toArray(new MenuItem[0]) : new MenuItem[]{menuItemFindItem};
            final RunnableC13667 runnableC13667 = new RunnableC13667(3, this, z ? new MenuItem[]{menuItemFindItem} : (MenuItem[]) arrayList.toArray(new MenuItem[0]));
            ArrayList arrayList2 = new ArrayList();
            for (MenuItem menuItem : menuItemArr) {
                if (menuItem.isVisible()) {
                    View viewFindViewById = c6938.findViewById(menuItem.getItemId());
                    if (viewFindViewById != null) {
                        arrayList2.add(viewFindViewById);
                    } else {
                        menuItem.setVisible(false);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                for (MenuItem menuItem2 : menuItemArr) {
                    menuItem2.setVisible(false);
                }
                runnableC13667.run();
                return;
            }
            int i2 = 0;
            while (i2 < arrayList2.size()) {
                View view = (View) arrayList2.get(i2);
                boolean z3 = i2 == arrayList2.size() - 1;
                view.animate().cancel();
                ViewPropertyAnimator duration = view.animate().alpha(0.0f).setDuration(100L);
                if (z3) {
                    duration.withEndAction(new Runnable() { // from class: l.ܰۜ᩺
                        @Override // java.lang.Runnable
                        public final void run() {
                            C11546.m28837(this.f45053, menuItemArr, runnableC13667);
                        }
                    });
                }
                i2++;
            }
            return;
        }
        View viewFindViewById2 = c6938.findViewById(menuItemFindItem.getItemId());
        if (viewFindViewById2 != null) {
            viewFindViewById2.animate().cancel();
            viewFindViewById2.setAlpha(1.0f);
        }
        for (MenuItem menuItem3 : arrayList) {
            View viewFindViewById3 = c6938.findViewById(menuItem3.getItemId());
            if (viewFindViewById3 != null) {
                viewFindViewById3.animate().cancel();
                viewFindViewById3.setAlpha(1.0f);
            }
            menuItem3.setVisible(!z);
        }
        menuItemFindItem.setVisible(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28837(C11546 c11546, MenuItem[] menuItemArr, RunnableC13667 runnableC13667) {
        for (MenuItem menuItem : menuItemArr) {
            menuItem.setVisible(false);
            View viewFindViewById = c11546.f38833.findViewById(menuItem.getItemId());
            if (viewFindViewById != null) {
                viewFindViewById.setAlpha(1.0f);
            }
        }
        runnableC13667.run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28836(C11546 c11546, MenuItem[] menuItemArr) {
        for (MenuItem menuItem : menuItemArr) {
            menuItem.setVisible(true);
            View viewFindViewById = c11546.f38833.findViewById(menuItem.getItemId());
            if (viewFindViewById != null) {
                viewFindViewById.animate().cancel();
                viewFindViewById.setAlpha(0.0f);
                viewFindViewById.animate().alpha(1.0f).setDuration(100L);
            }
        }
    }
}
