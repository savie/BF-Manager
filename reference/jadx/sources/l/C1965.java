package l;

import android.os.Bundle;
import android.view.View;
import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.֫ܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public class C1965 extends ComponentCallbacksC11612 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C20283 f6588;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f6589;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C25227 f6590;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int[] f6591;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C22761 f6592;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f6593;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f6594;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C19864 f6595;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f6596;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f6597;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f6598;

    public C1965() {
        super(R.layout.MT_Protector);
        this.f6593 = true;
    }

    @Override // l.ComponentCallbacksC11612
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C22761 c22761 = (C22761) new C16196(requireActivity()).m38422(C22761.class);
        this.f6592 = c22761;
        c22761.m51321().m40350(this, new InterfaceC16438() { // from class: l.۟ۘۧ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                C1965.m6753(this.f25169, (C20283) obj);
            }
        });
        this.f6595 = new C19864(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6753(C1965 c1965, C20283 c20283) {
        c1965.f6588 = c20283;
        c1965.f6592.m51302(c1965, new C8114(c1965));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6749(C1965 c1965) {
        if (c1965.f6593) {
            c1965.f6593 = false;
            c1965.f6598 = false;
            c1965.f6589 = false;
            AbstractC22044 abstractC22044M24694 = c1965.f6588.m46610().m24694("strings");
            if (abstractC22044M24694.mo2934()) {
                try {
                    C12492 c12492 = new C12492(new GZIPInputStream(abstractC22044M24694.mo4290()));
                    try {
                        if (c12492.readInt() == 830747697) {
                            int i = c12492.readInt();
                            c1965.f6596 = new ArrayList(i);
                            byte[] bArr = new byte[1024];
                            for (int i2 = 0; i2 < i; i2++) {
                                int i3 = c12492.read();
                                if (i3 == -1) {
                                    throw new EOFException();
                                }
                                if (i3 != 0) {
                                    c1965.f6598 = true;
                                    c1965.f6596.add(new C13591(c12492.m31034(bArr), c12492.m31034(bArr)));
                                } else {
                                    c1965.f6596.add(new C13591(c12492.m31034(bArr)));
                                }
                            }
                            c1965.m6761();
                            AbstractC22044 abstractC22044M24695 = c1965.f6588.m46610().m24694("strings_changed");
                            if (c1965.f6598) {
                                abstractC22044M24695.getClass();
                                abstractC22044M24695.m49850(new byte[]{1}, 0, 1);
                            } else {
                                abstractC22044M24695.mo4296();
                            }
                            c1965.f6595.notifyDataSetChanged();
                            c12492.close();
                            return;
                        }
                        c12492.close();
                    } catch (Throwable th) {
                        try {
                            c12492.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    C22761 c22761 = c1965.f6592;
                    if (c22761 != null) {
                        c22761.m51299(th3);
                    }
                }
            }
            new C9116(c1965, R.string.MT_Protector).m8197();
        }
    }

    @Override // l.ComponentCallbacksC11612
    public final void onViewCreated(View view, Bundle bundle) {
        C25227 c25227 = (C25227) view.findViewById(R.id.MT_Protector);
        this.f6590 = c25227;
        c25227.setTag("RecyclerView3");
        this.f6590.setAdapter(this.f6595);
        this.f6592.m51305(getViewLifecycleOwner(), new C13688(this));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6766(C1965 c1965) {
        c1965.f6590.scrollToPosition(0);
        c1965.f6595.m45721();
    }

    @Override // l.ComponentCallbacksC11612
    public final void onDestroyView() {
        super.onDestroyView();
        this.f6590.setAdapter(null);
        this.f6590 = null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m6772() {
        m6748(this.f6596);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m6748(List list) {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C14729(this.f6588.m46610().m24694("strings").mo4289(false)));
            try {
                C21443.m48761(bufferedOutputStream, 830747697);
                C21443.m48761(bufferedOutputStream, list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C13591 c13591 = (C13591) it.next();
                    bufferedOutputStream.write(c13591.f43170 ? 255 : 0);
                    String str = c13591.f43171;
                    C21443.m48761(bufferedOutputStream, C21443.m48759(str));
                    C21443.m48762(bufferedOutputStream, str);
                    if (c13591.f43170) {
                        String str2 = c13591.f43169;
                        C21443.m48761(bufferedOutputStream, C21443.m48759(str2));
                        C21443.m48762(bufferedOutputStream, str2);
                    }
                }
                bufferedOutputStream.close();
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            C22761 c22761 = this.f6592;
            if (c22761 != null) {
                c22761.m51299(e);
            }
        }
        AbstractC22044 abstractC22044M24694 = this.f6588.m46610().m24694("strings_changed");
        if (this.f6598) {
            try {
                abstractC22044M24694.getClass();
                abstractC22044M24694.m49850(new byte[]{1}, 0, 1);
                return;
            } catch (IOException e2) {
                C22761 c22762 = this.f6592;
                if (c22762 != null) {
                    c22762.m51299(e2);
                    return;
                }
                return;
            }
        }
        abstractC22044M24694.mo4296();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m6764(C1965 c1965) {
        AbstractC22044 abstractC22044M24694 = c1965.f6588.m46610().m24694("stringsFilter");
        if (!c1965.f6589) {
            abstractC22044M24694.mo4296();
            return;
        }
        C6178 c6178M34975 = C14483.m34975(1143374470);
        c6178M34975.m17786((CharSequence) c1965.f6594);
        c6178M34975.writeInt(c1965.f6597);
        for (int i = 0; i < c1965.f6597; i++) {
            c6178M34975.writeInt(c1965.f6591[i]);
        }
        try {
            abstractC22044M24694.m49844(c6178M34975);
        } catch (IOException e) {
            if (c1965.f6592 != null) {
                c1965.f6592.m51299(e);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m6761() {
        AbstractC22044 abstractC22044M24694 = this.f6588.m46610().m24694("stringsFilter");
        if (abstractC22044M24694.mo2934()) {
            C20348 c20348M49835 = abstractC22044M24694.m49835();
            if (c20348M49835.readInt() == 1143374470) {
                this.f6589 = true;
                this.f6594 = c20348M49835.m46756();
                int i = c20348M49835.readInt();
                this.f6597 = i;
                int[] iArr = this.f6591;
                if (iArr == null || iArr.length < i) {
                    this.f6591 = new int[i];
                }
                for (int i2 = 0; i2 < this.f6597; i2++) {
                    this.f6591[i2] = c20348M49835.readInt();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static void m6762(C1965 c1965) {
        new C2405(c1965, (AbstractActivityC17204) c1965.requireActivity(), c1965.f6589, C10826.m27556()).m55055();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m6763(C1965 c1965) {
        ActivityC0848 activityC0848 = (ActivityC0848) c1965.requireActivity();
        C10745 c10745 = new C10745(activityC0848);
        c10745.m27397(R.string.MT_Protector);
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        final C6880 c6880 = new C6880(c1965, c10745, activityC0848);
        final C14307 c14307 = new C14307();
        for (C13591 c13591 : c1965.f6596) {
            if (c13591.f43170) {
                c14307.put(c13591.f43171, c13591.f43169);
            }
        }
        final C20283 c20283 = c1965.f6588;
        new Thread(new Runnable() { // from class: l.֡ۗۧ
            @Override // java.lang.Runnable
            public final void run() {
                final C17539 c17539 = new C17539();
                final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                C20283 c20284 = c20283;
                c20284.m46582(concurrentLinkedQueue, "", true, (Predicate) null);
                final InterfaceC16793 interfaceC16793 = c6880;
                interfaceC16793.mo13596(0);
                final C3374 c3374 = new C3374(concurrentLinkedQueue.size());
                c3374.m11078(new C8114(interfaceC16793));
                final C14307 c14308 = c14307;
                Runnable runnable = new Runnable() { // from class: l.ᩳۗۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC14906 interfaceC14906;
                        String string;
                        while (true) {
                            ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                            if (concurrentLinkedQueue2.isEmpty() || (interfaceC14906 = (InterfaceC14906) concurrentLinkedQueue2.poll()) == null || interfaceC16793.mo13593()) {
                                return;
                            }
                            c3374.m11079(1);
                            String strMo10209 = interfaceC14906.mo10209();
                            C4137 c4137 = new C4137(strMo10209);
                            C0560 c0560 = new C0560(strMo10209.length());
                            int i = 0;
                            int i2 = 0;
                            while (c4137.m13266()) {
                                String str = (String) c14308.get(c4137.f14034);
                                if (str != null) {
                                    c0560.append((CharSequence) strMo10209, i2, c4137.f14035);
                                    try {
                                        C3652.m11836(c0560, str);
                                    } catch (IOException unused) {
                                    }
                                    i2 = c4137.f14032;
                                    i++;
                                }
                            }
                            if (i == 0) {
                                string = null;
                            } else {
                                c17539.m41195(i);
                                if (i2 < strMo10209.length()) {
                                    c0560.append((CharSequence) strMo10209, i2, strMo10209.length());
                                }
                                string = c0560.toString();
                            }
                            if (string != null) {
                                interfaceC14906.mo10204(string);
                            }
                        }
                    }
                };
                c20284.m46595();
                c20284.m46591(false);
                C3369.m11069((int) (C11138.f35105 * 0.66f), runnable);
                c20284.m46591(true);
                c20284.m46573();
                C21576.m49068(new RunnableC9840(0, interfaceC16793, c17539));
            }
        }).start();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC12964 m6773() {
        return this.f6595;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List m6771() {
        return this.f6596;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m6774() {
        boolean z;
        Iterator it = this.f6596.iterator();
        while (it.hasNext()) {
            if (((C13591) it.next()).f43170) {
                z = true;
                this.f6598 = z;
            }
        }
        z = false;
        this.f6598 = z;
    }
}
