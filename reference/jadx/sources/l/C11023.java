package l;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Environment;
import android.os.SystemClock;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۤܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11023 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f34811;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f34812;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19974 f34813;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f34814;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f34815;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f34816;

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        ViewOnClickListenerC22958 viewOnClickListenerC22958 = (ViewOnClickListenerC22958) abstractC11800;
        C2908 c2908 = (C2908) this.f34811.get(i);
        viewOnClickListenerC22958.f74575.setText(c2908.f9518);
        viewOnClickListenerC22958.f74578.setText(c2908.f9521);
        viewOnClickListenerC22958.f74579.setImageDrawable(c2908.f9517);
        viewOnClickListenerC22958.f74577 = c2908;
        c2908.f9516 = true;
        if (System.currentTimeMillis() - this.f34816 < 300) {
            viewOnClickListenerC22958.itemView.setAlpha(0.0f);
            ObjectAnimator.ofFloat(viewOnClickListenerC22958.itemView, "alpha", 0.0f, 1.0f).start();
        }
    }

    public C11023(ActivityC19974 activityC19974) {
        this.f34813 = activityC19974;
        String path = Environment.getExternalStorageDirectory().getPath();
        this.f34814 = path;
        this.f34811 = new ArrayList();
        this.f34812 = new AtomicInteger();
        String string = ApplicationC17729.f58258.getString("apk_selector_path", path);
        this.f34815 = string;
        if (string.startsWith(path) && C14584.m35193(this.f34815, new String[0]).mo2934()) {
            return;
        }
        this.f34815 = path;
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC22958(this.f34813, viewGroup);
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f34811.size();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27889(final String str) {
        final int iIncrementAndGet = this.f34812.incrementAndGet();
        final List list = this.f34811;
        this.f34811 = Collections.EMPTY_LIST;
        notifyDataSetChanged();
        C5261.f18540.execute(new Runnable() { // from class: l.ۜ᩶ۧ
            @Override // java.lang.Runnable
            public final void run() {
                C11023.m27887(this.f24324, list, str, iIncrementAndGet);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27887(final C11023 c11023, final List list, final String str, int i) {
        ActivityC19974 activityC19974 = c11023.f34813;
        list.clear();
        if (!c11023.f34815.equals(c11023.f34814)) {
            list.add(new C2908(0));
        }
        for (AbstractC22044 abstractC22044 : C14584.m35193(c11023.f34815, new String[0]).mo4299(true)) {
            if (abstractC22044.mo4281() || abstractC22044.getName().toLowerCase().endsWith(".apk")) {
                list.add(new C2908(abstractC22044));
            }
        }
        Collections.sort(list, new C14094());
        activityC19974.runOnUiThread(new Runnable() { // from class: l.ۙܿۧ
            @Override // java.lang.Runnable
            public final void run() {
                C11023.m27886(this.f17637, list, str);
            }
        });
        SystemClock.sleep(100L);
        for (int i2 = 0; i2 < list.size() && i == c11023.f34812.get(); i2++) {
            try {
                final C2908 c2908 = (C2908) list.get(i2);
                if (!c2908.f9519) {
                    AbstractC22044 abstractC22045 = c2908.f9520;
                    String strMo4294 = abstractC22045.mo4294();
                    long jMo4285 = abstractC22045.mo4285();
                    long jMo4286 = abstractC22045.mo4286();
                    int i3 = C0217.f1419;
                    final Drawable drawableM30080 = C2166.m7448(C15022.m36181(strMo4294 + jMo4285 + jMo4286).toLowerCase(), C20613.f66074, false, new C19411(4, abstractC22045)).m30080();
                    activityC19974.runOnUiThread(new Runnable() { // from class: l.᩷ܿۧ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2908 c2909 = c2908;
                            boolean z = c2909.f9516;
                            C6389 c6389 = c2909.f9517;
                            Drawable drawable = drawableM30080;
                            if (!z) {
                                c6389.setDrawable(drawable);
                                return;
                            }
                            Drawable drawable2 = c6389.getDrawable();
                            drawable.setBounds(drawable2.getBounds());
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
                            c6389.setDrawable(transitionDrawable);
                            transitionDrawable.setCrossFadeEnabled(true);
                            transitionDrawable.startTransition(300);
                        }
                    });
                }
            } catch (Exception unused) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27886(C11023 c11023, List list, String str) {
        ActivityC19974 activityC19974 = c11023.f34813;
        c11023.f34816 = System.currentTimeMillis();
        c11023.f34811 = list;
        c11023.notifyDataSetChanged();
        if (str != null) {
            for (int i = 0; i < list.size(); i++) {
                if (((C2908) list.get(i)).f9518.equalsIgnoreCase(str)) {
                    activityC19974.f64184.f28994.scrollToPosition(i);
                    return;
                }
            }
        }
        activityC19974.f64184.f28994.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27888() {
        String str = this.f34815;
        String str2 = this.f34814;
        if (str.equals(str2)) {
            return false;
        }
        AbstractC22044 abstractC22044M35193 = C14584.m35193(this.f34815, new String[0]);
        String parent = abstractC22044M35193.getParent();
        this.f34815 = parent;
        if (parent == null) {
            this.f34815 = str2;
        }
        m27889(abstractC22044M35193.getName());
        return true;
    }
}
