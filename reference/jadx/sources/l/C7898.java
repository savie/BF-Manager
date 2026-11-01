package l;

import android.os.Bundle;
import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.۠ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public class C7898 extends ComponentCallbacksC22654 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f25961;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18377 f25962;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f25963;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f25964;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int[] f25965;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C17492 f25966;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C14954 f25967;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f25968;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f25969;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8229 f25970;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f25971;

    public C7898() {
        super(R.layout.MT_Protector);
        this.f25971 = true;
    }

    @Override // l.ComponentCallbacksC22654
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C18377 c18377 = (C18377) new C16717(requireActivity()).m39205(C18377.class);
        this.f25962 = c18377;
        c18377.m42658().m44959(this, new InterfaceC10597() { // from class: l.ۙۗۘ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                C7898.m20887(this.f15613, (C8229) obj);
            }
        });
        this.f25967 = new C14954(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20887(C7898 c7898, C8229 c8229) {
        c7898.f25970 = c8229;
        c7898.f25962.m42637(c7898, new C23396(c7898));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20882(C7898 c7898) {
        if (c7898.f25971) {
            c7898.f25971 = false;
            c7898.f25961 = false;
            c7898.f25964 = false;
            try {
                AbstractC20745 abstractC20745M33320 = c7898.f25970.m21572().m33320("strings");
                if (abstractC20745M33320.mo33975()) {
                    byte[] bArrM46727 = abstractC20745M33320.m46727();
                    int i = C18019.f57618;
                    C17367 c17367 = new C17367(C18019.m41969(bArrM46727, bArrM46727.length));
                    if (c17367.readInt() == 830747697) {
                        int i2 = c17367.readInt();
                        c7898.f25968 = new ArrayList(i2);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if (c17367.m40461()) {
                                c7898.f25961 = true;
                                c7898.f25968.add(new C0841(c17367.m40442(), c17367.m40442()));
                            } else {
                                c7898.f25968.add(new C0841(c17367.m40442()));
                            }
                        }
                        c7898.m20900();
                        AbstractC20745 abstractC20745M33321 = c7898.f25970.m21572().m33320("strings_changed");
                        if (c7898.f25961) {
                            abstractC20745M33321.getClass();
                            abstractC20745M33321.m46704(new byte[]{1}, 0, 1);
                        } else {
                            abstractC20745M33321.mo24647();
                        }
                        c7898.f25967.notifyDataSetChanged();
                        return;
                    }
                }
            } catch (Throwable th) {
                C18377 c18377 = c7898.f25962;
                if (c18377 != null) {
                    c18377.m42627(th);
                }
            }
            c7898.m20903(R.string.MT_Protector);
        }
    }

    @Override // l.ComponentCallbacksC22654
    public final void onViewCreated(View view, Bundle bundle) {
        C17492 c17492 = (C17492) view.findViewById(R.id.MT_Protector);
        this.f25966 = c17492;
        c17492.setTag("RecyclerView3");
        this.f25966.setAdapter(this.f25967);
        this.f25962.m42631(getViewLifecycleOwner(), new C3145(0, this));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20894(C7898 c7898) {
        c7898.f25966.scrollToPosition(0);
        c7898.f25967.m35895();
    }

    @Override // l.ComponentCallbacksC22654
    public final void onDestroyView() {
        super.onDestroyView();
        this.f25966.setAdapter(null);
        this.f25966 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20903(final int i) {
        final ActivityC5677 activityC5677 = (ActivityC5677) requireActivity();
        Runnable runnable = new Runnable() { // from class: l.ܰۗۘ
            @Override // java.lang.Runnable
            public final void run() {
                new C11426(this.f44702, activityC5677, i).m10243();
            }
        };
        if (activityC5677.m15665()) {
            if (this.f25968 == null) {
                this.f25968 = Collections.EMPTY_LIST;
                this.f25964 = false;
                this.f25961 = false;
                this.f25967.notifyDataSetChanged();
            }
            activityC5677.m15669(runnable);
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m20904() {
        m20881(this.f25968);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m20881(List list) {
        C11018 c11018M43576 = C18917.m43576(830747697);
        c11018M43576.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0841 c0841 = (C0841) it.next();
            c11018M43576.m27784(c0841.f3484);
            c11018M43576.m27782((CharSequence) c0841.f3485);
            if (c0841.f3484) {
                c11018M43576.m27782((CharSequence) c0841.f3483);
            }
        }
        AbstractC20745 abstractC20745M33320 = this.f25970.m21572().m33320("strings");
        try {
            byte[] bArrM27773 = c11018M43576.m27773();
            int i = C18019.f57618;
            abstractC20745M33320.m46703(C18019.m41968(bArrM27773, bArrM27773.length));
        } catch (IOException e) {
            C18377 c18377 = this.f25962;
            if (c18377 != null) {
                c18377.m42627((Throwable) e);
            }
        }
        AbstractC20745 abstractC20745M33321 = this.f25970.m21572().m33320("strings_changed");
        if (!this.f25961) {
            abstractC20745M33321.mo24647();
            return;
        }
        try {
            abstractC20745M33321.getClass();
            abstractC20745M33321.m46704(new byte[]{1}, 0, 1);
        } catch (IOException e2) {
            C18377 c18378 = this.f25962;
            if (c18378 != null) {
                c18378.m42627((Throwable) e2);
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m20898(C7898 c7898) {
        AbstractC20745 abstractC20745M33320 = c7898.f25970.m21572().m33320("stringsFilter");
        if (!c7898.f25964) {
            abstractC20745M33320.mo24647();
            return;
        }
        C11018 c11018M43576 = C18917.m43576(1143374470);
        c11018M43576.m27782((CharSequence) c7898.f25963);
        c11018M43576.writeInt(c7898.f25969);
        for (int i = 0; i < c7898.f25969; i++) {
            c11018M43576.writeInt(c7898.f25965[i]);
        }
        try {
            abstractC20745M33320.m46697(c11018M43576);
        } catch (IOException e) {
            if (c7898.f25962 != null) {
                c7898.f25962.m42627((Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m20900() {
        AbstractC20745 abstractC20745M33320 = this.f25970.m21572().m33320("stringsFilter");
        if (abstractC20745M33320.mo33975()) {
            C17367 c17367M46713 = abstractC20745M33320.m46713();
            if (c17367M46713.readInt() == 1143374470) {
                this.f25964 = true;
                this.f25963 = c17367M46713.m40442();
                int i = c17367M46713.readInt();
                this.f25969 = i;
                int[] iArr = this.f25965;
                if (iArr == null || iArr.length < i) {
                    this.f25965 = new int[i];
                }
                for (int i2 = 0; i2 < this.f25969; i2++) {
                    this.f25965[i2] = c17367M46713.readInt();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m20897(C7898 c7898) {
        new C2252(c7898, (AbstractActivityC12483) c7898.requireActivity(), c7898.f25964, C21905.m48704()).m15185();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static void m20896(C7898 c7898) {
        ActivityC5677 activityC5677 = (ActivityC5677) c7898.requireActivity();
        C1777 c1777 = new C1777(activityC5677);
        c1777.m5837(R.string.MT_Protector);
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        final C22009 c22009 = new C22009(c7898, c1777, activityC5677);
        final C21445 c21445 = new C21445();
        for (C0841 c0841 : c7898.f25968) {
            if (c0841.f3484) {
                c21445.put(c0841.f3485, c0841.f3483);
            }
        }
        final C8229 c8229 = c7898.f25970;
        new Thread(new Runnable() { // from class: l.ۢܳۘ
            @Override // java.lang.Runnable
            public final void run() {
                final InterfaceC16261 interfaceC16261 = c22009;
                C8229 c82210 = c8229;
                final C22674 c22674 = new C22674(c82210, true);
                try {
                    c22674.f73834 = c82210.m21605();
                    final C20494 c20494 = new C20494();
                    final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    c82210.m21579(concurrentLinkedQueue, "", true, (Set) null);
                    interfaceC16261.mo15795(0);
                    final C8516 c8516 = new C8516(concurrentLinkedQueue.size());
                    c8516.m22241(new C16041(interfaceC16261));
                    final C21445 c21446 = c21445;
                    Runnable runnable = new Runnable() { // from class: l.ܳܳۘ
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC9974 interfaceC9974;
                            while (true) {
                                ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                                if (concurrentLinkedQueue2.isEmpty() || (interfaceC9974 = (InterfaceC9974) concurrentLinkedQueue2.poll()) == null || interfaceC16261.mo15792()) {
                                    return;
                                }
                                c8516.m22242(1);
                                String strMo25238 = interfaceC9974.mo25238();
                                List<C0787> listM50206 = c22674.m50206(interfaceC9974.getPath());
                                String string = null;
                                if (listM50206 != null) {
                                    StringBuilder sb = new StringBuilder(strMo25238.length());
                                    int i = 0;
                                    int i2 = 0;
                                    for (C0787 c0787 : listM50206) {
                                        if (c0787.f3371 == 1) {
                                            String str = (String) c21446.getOrDefault(c0787.f3366, null);
                                            if (str != null) {
                                                sb.append((CharSequence) strMo25238, i2, c0787.f3369);
                                                sb.append(C13985.m33830(str));
                                                i2 = c0787.f3367;
                                                i++;
                                            }
                                        }
                                    }
                                    if (i != 0) {
                                        c20494.m46298(i);
                                        if (i2 < strMo25238.length()) {
                                            sb.append((CharSequence) strMo25238, i2, strMo25238.length());
                                        }
                                        string = sb.toString();
                                    }
                                }
                                if (string != null) {
                                    interfaceC9974.mo25239(string);
                                }
                            }
                        }
                    };
                    c82210.m21587(false);
                    C12733.m31637((int) (C5464.f18831 * 0.66f), runnable);
                    c82210.m21587(true);
                    C16737.m39273(new RunnableC21795(3, interfaceC16261, c20494));
                } catch (Exception e) {
                    C16737.m39273(new Runnable() { // from class: l.᩻ܳۘ
                        @Override // java.lang.Runnable
                        public final void run() {
                            Exception exc = e;
                            InterfaceC16261 interfaceC16262 = interfaceC16261;
                            c22674.m50207(interfaceC16262.mo15793(), exc);
                            interfaceC16262.mo15794();
                        }
                    });
                }
            }
        }).start();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC0414 m20906() {
        return this.f25967;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List m20905() {
        return this.f25968;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m20902() {
        boolean z;
        Iterator it = this.f25968.iterator();
        while (it.hasNext()) {
            if (((C0841) it.next()).f3484) {
                z = true;
                this.f25961 = z;
            }
        }
        z = false;
        this.f25961 = z;
    }
}
