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

/* JADX INFO: renamed from: l.ۡۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes3.dex */
public final class C8710 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f29949;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f29950;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f29951;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f29952;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f29953;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7298 f29954;

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        ViewOnClickListenerC10121 viewOnClickListenerC10121 = (ViewOnClickListenerC10121) abstractC12554;
        C15060 c15060 = (C15060) this.f29950.get(i);
        viewOnClickListenerC10121.f34602.setText(c15060.f49109);
        viewOnClickListenerC10121.f34599.setText(c15060.f49104);
        viewOnClickListenerC10121.f34603.setImageDrawable(c15060.f49107);
        viewOnClickListenerC10121.f34601 = c15060;
        c15060.f49105 = true;
        if (System.currentTimeMillis() - this.f29949 < 300) {
            viewOnClickListenerC10121.itemView.setAlpha(0.0f);
            ObjectAnimator.ofFloat(viewOnClickListenerC10121.itemView, "alpha", 0.0f, 1.0f).start();
        }
    }

    public C8710(ActivityC7298 activityC7298) {
        this.f29954 = activityC7298;
        String path = Environment.getExternalStorageDirectory().getPath();
        this.f29951 = path;
        this.f29950 = new ArrayList();
        this.f29952 = new AtomicInteger();
        String string = ApplicationC0716.f2992.getString("apk_selector_path", path);
        this.f29953 = string;
        if (string.startsWith(path) && C5553.m15313(this.f29953, new String[0]).mo33975()) {
            return;
        }
        this.f29953 = path;
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC10121(this.f29954, viewGroup);
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f29950.size();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22542(final String str) {
        final int iIncrementAndGet = this.f29952.incrementAndGet();
        final List list = this.f29950;
        this.f29950 = Collections.EMPTY_LIST;
        notifyDataSetChanged();
        C4716.f16636.execute(new Runnable() { // from class: l.ᩳۜۜ
            @Override // java.lang.Runnable
            public final void run() {
                C8710.m22540(this.f56637, list, str, iIncrementAndGet);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22540(final C8710 c8710, final List list, final String str, int i) {
        ActivityC7298 activityC7298 = c8710.f29954;
        list.clear();
        if (!c8710.f29953.equals(c8710.f29951)) {
            list.add(new C15060(0));
        }
        int i2 = 1;
        for (AbstractC20745 abstractC20745 : C5553.m15313(c8710.f29953, new String[0]).mo33983(true)) {
            if (abstractC20745.mo33974() || abstractC20745.getName().toLowerCase().endsWith(".apk")) {
                list.add(new C15060(abstractC20745));
            }
        }
        Collections.sort(list, new C18587());
        activityC7298.runOnUiThread(new Runnable() { // from class: l.۠ۜۜ
            @Override // java.lang.Runnable
            public final void run() {
                C8710.m22539(this.f26251, list, str);
            }
        });
        SystemClock.sleep(100L);
        for (int i3 = 0; i3 < list.size() && i == c8710.f29952.get(); i3++) {
            try {
                final C15060 c15060 = (C15060) list.get(i3);
                if (!c15060.f49106) {
                    AbstractC20745 abstractC20746 = c15060.f49108;
                    String strMo33986 = abstractC20746.mo33986();
                    long jMo33964 = abstractC20746.mo33964();
                    long jMo33991 = abstractC20746.mo33991();
                    int i4 = C17169.f54735;
                    final Drawable drawableM35074 = C18225.m42373(C22253.m49423(strMo33986 + jMo33964 + jMo33991).toLowerCase(), C0690.f2890, false, new C22317(abstractC20746, i2)).m35074();
                    activityC7298.runOnUiThread(new Runnable() { // from class: l.᩵ۜۜ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C15060 c15061 = c15060;
                            boolean z = c15061.f49105;
                            C19122 c19122 = c15061.f49107;
                            Drawable drawable = drawableM35074;
                            if (!z) {
                                c19122.setDrawable(drawable);
                                return;
                            }
                            Drawable drawable2 = c19122.getDrawable();
                            drawable.setBounds(drawable2.getBounds());
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
                            c19122.setDrawable(transitionDrawable);
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
    public static /* synthetic */ void m22539(C8710 c8710, List list, String str) {
        ActivityC7298 activityC7298 = c8710.f29954;
        c8710.f29949 = System.currentTimeMillis();
        c8710.f29950 = list;
        c8710.notifyDataSetChanged();
        if (str != null) {
            for (int i = 0; i < list.size(); i++) {
                if (((C15060) list.get(i)).f49109.equalsIgnoreCase(str)) {
                    activityC7298.f24234.f69597.scrollToPosition(i);
                    return;
                }
            }
        }
        activityC7298.f24234.f69597.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22541() {
        String str = this.f29953;
        String str2 = this.f29951;
        if (str.equals(str2)) {
            return false;
        }
        AbstractC20745 abstractC20745M15313 = C5553.m15313(this.f29953, new String[0]);
        String parent = abstractC20745M15313.getParent();
        this.f29953 = parent;
        if (parent == null) {
            this.f29953 = str2;
        }
        m22542(abstractC20745M15313.getName());
        return true;
    }
}
