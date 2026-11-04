package l;

import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V7F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8887 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC12964 f29031;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f29032;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16390 f29033;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f29034;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C11999 f29035;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f29036;

    public C8887(C16390 c16390, int... iArr) {
        this.f29033 = c16390;
        this.f29032 = iArr;
        c16390.getMenu().findItem(R.id.MT_Protector).setIcon(R.drawable.MT_Protector);
        m23768(false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23773(AbstractC12964 abstractC12964) {
        this.f29031 = abstractC12964;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23772(C11999 c11999) {
        this.f29035 = c11999;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m23776() {
        return this.f29036;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m23775() {
        m23768(this.f29036, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23769() {
        if (this.f29036) {
            return;
        }
        this.f29036 = true;
        this.f29034 = SystemClock.uptimeMillis();
        AbstractC12964 abstractC12964 = this.f29031;
        if (abstractC12964 != null) {
            abstractC12964.notifyDataSetChanged();
        }
        m23768(true, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23774(boolean z) {
        if (this.f29036) {
            this.f29036 = false;
            this.f29034 = SystemClock.uptimeMillis();
            AbstractC12964 abstractC12964 = this.f29031;
            if (abstractC12964 != null) {
                abstractC12964.notifyDataSetChanged();
            }
            m23768(false, z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23770(ImageView imageView, boolean z) {
        imageView.animate().cancel();
        if (!z) {
            imageView.setVisibility(8);
            imageView.setAlpha(1.0f);
            return;
        }
        if (SystemClock.uptimeMillis() - this.f29034 >= 100) {
            imageView.setVisibility(this.f29036 ? 0 : 8);
            imageView.setAlpha(1.0f);
        } else if (this.f29036) {
            imageView.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.animate().alpha(1.0f).setDuration(200L);
        } else {
            imageView.setVisibility(0);
            imageView.animate().alpha(0.0f).setDuration(200L).withEndAction(new RunnableC15279(3, imageView));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23771(AbstractC11800 abstractC11800) {
        C11999 c11999;
        if (!this.f29036 || (c11999 = this.f29035) == null) {
            return;
        }
        c11999.m30178(abstractC11800);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23768(boolean z, boolean z2) {
        C16390 c16390 = this.f29033;
        Menu menu = c16390.getMenu();
        MenuItem menuItemFindItem = menu.findItem(R.id.MT_Protector);
        if (menuItemFindItem == null) {
            return;
        }
        ArrayList<MenuItem> arrayList = new ArrayList();
        for (int i : this.f29032) {
            MenuItem menuItemFindItem2 = menu.findItem(i);
            if (menuItemFindItem2 != null) {
                arrayList.add(menuItemFindItem2);
            }
        }
        if (z2) {
            MenuItem[] menuItemArr = z ? (MenuItem[]) arrayList.toArray(new MenuItem[0]) : new MenuItem[]{menuItemFindItem};
            RunnableC9632 runnableC9632 = new RunnableC9632(0, this, z ? new MenuItem[]{menuItemFindItem} : (MenuItem[]) arrayList.toArray(new MenuItem[0]));
            ArrayList arrayList2 = new ArrayList();
            for (MenuItem menuItem : menuItemArr) {
                if (menuItem.isVisible()) {
                    View viewFindViewById = c16390.findViewById(menuItem.getItemId());
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
                runnableC9632.run();
                return;
            }
            int i2 = 0;
            while (i2 < arrayList2.size()) {
                View view = (View) arrayList2.get(i2);
                boolean z3 = i2 == arrayList2.size() - 1;
                view.animate().cancel();
                ViewPropertyAnimator duration = view.animate().alpha(0.0f).setDuration(100L);
                if (z3) {
                    duration.withEndAction(new RunnableC2921(this, menuItemArr, runnableC9632, 0));
                }
                i2++;
            }
            return;
        }
        View viewFindViewById2 = c16390.findViewById(menuItemFindItem.getItemId());
        if (viewFindViewById2 != null) {
            viewFindViewById2.animate().cancel();
            viewFindViewById2.setAlpha(1.0f);
        }
        for (MenuItem menuItem3 : arrayList) {
            View viewFindViewById3 = c16390.findViewById(menuItem3.getItemId());
            if (viewFindViewById3 != null) {
                viewFindViewById3.animate().cancel();
                viewFindViewById3.setAlpha(1.0f);
            }
            menuItem3.setVisible(!z);
        }
        menuItemFindItem.setVisible(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23767(C8887 c8887, MenuItem[] menuItemArr, RunnableC9632 runnableC9632) {
        for (MenuItem menuItem : menuItemArr) {
            menuItem.setVisible(false);
            View viewFindViewById = c8887.f29033.findViewById(menuItem.getItemId());
            if (viewFindViewById != null) {
                viewFindViewById.setAlpha(1.0f);
            }
        }
        runnableC9632.run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23766(C8887 c8887, MenuItem[] menuItemArr) {
        for (MenuItem menuItem : menuItemArr) {
            menuItem.setVisible(true);
            View viewFindViewById = c8887.f29033.findViewById(menuItem.getItemId());
            if (viewFindViewById != null) {
                viewFindViewById.animate().cancel();
                viewFindViewById.setAlpha(0.0f);
                viewFindViewById.animate().alpha(1.0f).setDuration(100L);
            }
        }
    }
}
