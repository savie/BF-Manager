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

/* JADX INFO: renamed from: l.֫ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public class C2009 extends ComponentCallbacksC11612 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f6682;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f6683;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C25227 f6684;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int[] f6685;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C22761 f6686;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f6687;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f6688;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C19908 f6689;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f6690;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f6691;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C11967 f6692;

    public C2009() {
        super(R.layout.MT_Protector);
        this.f6687 = true;
    }

    @Override // l.ComponentCallbacksC11612
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C22761 c22761 = (C22761) new C16196(requireActivity()).m38422(C22761.class);
        this.f6686 = c22761;
        c22761.m51322().m40350(this, new InterfaceC16438() { // from class: l.ۢܽۧ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                C2009.m6872(this.f32750, (C11967) obj);
            }
        });
        this.f6689 = new C19908(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6872(C2009 c2009, C11967 c11967) {
        c2009.f6692 = c11967;
        c2009.f6686.m51303(c2009, new C11398(8, c2009));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6867(C2009 c2009) {
        if (c2009.f6687) {
            c2009.f6687 = false;
            c2009.f6690 = false;
            c2009.f6683 = false;
            try {
                AbstractC22044 abstractC22044M24694 = c2009.f6692.m29968().m24694("strings");
                if (abstractC22044M24694.mo2934()) {
                    byte[] bArrM49865 = abstractC22044M24694.m49865();
                    int i = C15768.f51344;
                    C20348 c20348 = new C20348(C15768.m37707(bArrM49865, bArrM49865.length));
                    if (c20348.readInt() == 830747697) {
                        int i2 = c20348.readInt();
                        c2009.f6682 = new ArrayList(i2);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if (c20348.m46753()) {
                                c2009.f6690 = true;
                                c2009.f6682.add(new C13984(c20348.m46756(), c20348.m46756()));
                            } else {
                                c2009.f6682.add(new C13984(c20348.m46756()));
                            }
                        }
                        c2009.m6880();
                        AbstractC22044 abstractC22044M24695 = c2009.f6692.m29968().m24694("strings_changed");
                        if (c2009.f6690) {
                            abstractC22044M24695.getClass();
                            abstractC22044M24695.m49850(new byte[]{1}, 0, 1);
                        } else {
                            abstractC22044M24695.mo4296();
                        }
                        c2009.f6689.notifyDataSetChanged();
                        return;
                    }
                }
            } catch (Throwable th) {
                C22761 c22761 = c2009.f6686;
                if (c22761 != null) {
                    c22761.m51299(th);
                }
            }
            c2009.m6889(R.string.MT_Protector);
        }
    }

    @Override // l.ComponentCallbacksC11612
    public final void onViewCreated(View view, Bundle bundle) {
        C25227 c25227 = (C25227) view.findViewById(R.id.MT_Protector);
        this.f6684 = c25227;
        c25227.setTag("RecyclerView3");
        this.f6684.setAdapter(this.f6689);
        this.f6686.m51312(getViewLifecycleOwner(), new C24159(this));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6885(C2009 c2009) {
        c2009.f6684.scrollToPosition(0);
        c2009.f6689.m45840();
    }

    @Override // l.ComponentCallbacksC11612
    public final void onDestroyView() {
        super.onDestroyView();
        this.f6684.setAdapter(null);
        this.f6684 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6889(final int i) {
        final ActivityC0848 activityC0848 = (ActivityC0848) requireActivity();
        Runnable runnable = new Runnable() { // from class: l.֨ܽۧ
            @Override // java.lang.Runnable
            public final void run() {
                new C9509(this.f4702, activityC0848, i).m8197();
            }
        };
        if (activityC0848.m3439()) {
            if (this.f6682 == null) {
                this.f6682 = Collections.EMPTY_LIST;
                this.f6683 = false;
                this.f6690 = false;
                this.f6689.notifyDataSetChanged();
            }
            activityC0848.m3436(runnable);
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m6891() {
        m6866(this.f6682);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m6866(List list) {
        C6178 c6178M34975 = C14483.m34975(830747697);
        c6178M34975.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C13984 c13984 = (C13984) it.next();
            c6178M34975.m17789(c13984.f44335);
            c6178M34975.m17786((CharSequence) c13984.f44336);
            if (c13984.f44335) {
                c6178M34975.m17786((CharSequence) c13984.f44334);
            }
        }
        AbstractC22044 abstractC22044M24694 = this.f6692.m29968().m24694("strings");
        try {
            byte[] bArrM17796 = c6178M34975.m17796();
            int i = C15768.f51344;
            abstractC22044M24694.m49849(C15768.m37706(bArrM17796, bArrM17796.length));
        } catch (IOException e) {
            C22761 c22761 = this.f6686;
            if (c22761 != null) {
                c22761.m51299(e);
            }
        }
        AbstractC22044 abstractC22044M24695 = this.f6692.m29968().m24694("strings_changed");
        if (!this.f6690) {
            abstractC22044M24695.mo4296();
            return;
        }
        try {
            abstractC22044M24695.getClass();
            abstractC22044M24695.m49850(new byte[]{1}, 0, 1);
        } catch (IOException e2) {
            C22761 c22762 = this.f6686;
            if (c22762 != null) {
                c22762.m51299(e2);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m6883(C2009 c2009) {
        AbstractC22044 abstractC22044M24694 = c2009.f6692.m29968().m24694("stringsFilter");
        if (!c2009.f6683) {
            abstractC22044M24694.mo4296();
            return;
        }
        C6178 c6178M34975 = C14483.m34975(1143374470);
        c6178M34975.m17786((CharSequence) c2009.f6688);
        c6178M34975.writeInt(c2009.f6691);
        for (int i = 0; i < c2009.f6691; i++) {
            c6178M34975.writeInt(c2009.f6685[i]);
        }
        try {
            abstractC22044M24694.m49844(c6178M34975);
        } catch (IOException e) {
            if (c2009.f6686 != null) {
                c2009.f6686.m51299(e);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m6880() {
        AbstractC22044 abstractC22044M24694 = this.f6692.m29968().m24694("stringsFilter");
        if (abstractC22044M24694.mo2934()) {
            C20348 c20348M49835 = abstractC22044M24694.m49835();
            if (c20348M49835.readInt() == 1143374470) {
                this.f6683 = true;
                this.f6688 = c20348M49835.m46756();
                int i = c20348M49835.readInt();
                this.f6691 = i;
                int[] iArr = this.f6685;
                if (iArr == null || iArr.length < i) {
                    this.f6685 = new int[i];
                }
                for (int i2 = 0; i2 < this.f6691; i2++) {
                    this.f6685[i2] = c20348M49835.readInt();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static void m6881(C2009 c2009) {
        new C2798(c2009, (AbstractActivityC17204) c2009.requireActivity(), c2009.f6683, C10826.m27556()).m55055();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m6882(C2009 c2009) {
        ActivityC0848 activityC0848 = (ActivityC0848) c2009.requireActivity();
        C10745 c10745 = new C10745(activityC0848);
        c10745.m27397(R.string.MT_Protector);
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        final C7273 c7273 = new C7273(c2009, c10745, activityC0848);
        final C14307 c14307 = new C14307();
        for (C13984 c13984 : c2009.f6682) {
            if (c13984.f44335) {
                c14307.put(c13984.f44336, c13984.f44334);
            }
        }
        final C11967 c11967 = c2009.f6692;
        new Thread(new Runnable() { // from class: l.֨᩻ۧ
            @Override // java.lang.Runnable
            public final void run() {
                final InterfaceC16793 interfaceC16793 = c7273;
                C11967 c11968 = c11967;
                final C15454 c15454 = new C15454(c11968, true);
                try {
                    c15454.f50312 = c11968.m29999();
                    final C17539 c17539 = new C17539();
                    final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    c11968.m29976(concurrentLinkedQueue, "", true, (Set) null);
                    interfaceC16793.mo13596(0);
                    final C3374 c3374 = new C3374(concurrentLinkedQueue.size());
                    c3374.m11078(new C8114(interfaceC16793));
                    final C14307 c14308 = c14307;
                    Runnable runnable = new Runnable() { // from class: l.ᩳ᩻ۧ
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC16200 interfaceC16200;
                            while (true) {
                                ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                                if (concurrentLinkedQueue2.isEmpty() || (interfaceC16200 = (InterfaceC16200) concurrentLinkedQueue2.poll()) == null || interfaceC16793.mo13593()) {
                                    return;
                                }
                                c3374.m11079(1);
                                String strMo7710 = interfaceC16200.mo7710();
                                List<C9442> listM37007 = c15454.m37007(interfaceC16200.getPath());
                                String string = null;
                                if (listM37007 != null) {
                                    StringBuilder sb = new StringBuilder(strMo7710.length());
                                    int i = 0;
                                    int i2 = 0;
                                    for (C9442 c9442 : listM37007) {
                                        if (c9442.f30619 == 1) {
                                            String str = (String) c14308.get(c9442.f30622);
                                            if (str != null) {
                                                sb.append((CharSequence) strMo7710, i2, c9442.f30618);
                                                sb.append(C1306.m4757(str));
                                                i2 = c9442.f30617;
                                                i++;
                                            }
                                        }
                                    }
                                    if (i != 0) {
                                        c17539.m41195(i);
                                        if (i2 < strMo7710.length()) {
                                            sb.append((CharSequence) strMo7710, i2, strMo7710.length());
                                        }
                                        string = sb.toString();
                                    }
                                }
                                if (string != null) {
                                    interfaceC16200.mo7711(string);
                                }
                            }
                        }
                    };
                    c11968.m29984(false);
                    C3369.m11069((int) (C11138.f35105 * 0.66f), runnable);
                    c11968.m29984(true);
                    C21576.m49068(new RunnableC11226(3, interfaceC16793, c17539));
                } catch (Exception e) {
                    C21576.m49068(new Runnable() { // from class: l.۟᩻ۧ
                        @Override // java.lang.Runnable
                        public final void run() {
                            Exception exc = e;
                            InterfaceC16793 interfaceC16794 = interfaceC16793;
                            c15454.m37008(interfaceC16794.mo13594(), exc);
                            interfaceC16794.mo13595();
                        }
                    });
                }
            }
        }).start();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC12964 m6892() {
        return this.f6689;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List m6890() {
        return this.f6682;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m6893() {
        boolean z;
        Iterator it = this.f6682.iterator();
        while (it.hasNext()) {
            if (((C13984) it.next()).f44335) {
                z = true;
                this.f6690 = z;
            }
        }
        z = false;
        this.f6690 = z;
    }
}
