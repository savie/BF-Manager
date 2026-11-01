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

/* JADX INFO: renamed from: l.᩷۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public class C20890 extends ComponentCallbacksC22654 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f67864;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18377 f67865;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f67866;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f67867;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int[] f67868;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C17492 f67869;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C19479 f67870;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C6094 f67871;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f67872;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f67873;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f67874;

    public C20890() {
        super(R.layout.MT_Protector);
        this.f67874 = true;
    }

    @Override // l.ComponentCallbacksC22654
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C18377 c18377 = (C18377) new C16717(requireActivity()).m39205(C18377.class);
        this.f67865 = c18377;
        c18377.m42622().m44959(this, new C20137(3, this));
        this.f67870 = new C19479(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46979(C20890 c20890, C6094 c6094) {
        c20890.f67871 = c6094;
        c20890.f67865.m42640(c20890, new C11509(7, c20890));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46975(C20890 c20890) {
        if (c20890.f67874) {
            c20890.f67874 = false;
            c20890.f67873 = false;
            c20890.f67867 = false;
            AbstractC20745 abstractC20745M33320 = c20890.f67871.m16575().m33320("strings");
            if (abstractC20745M33320.mo33975()) {
                try {
                    C16911 c16911 = new C16911(new GZIPInputStream(abstractC20745M33320.mo33970()));
                    try {
                        if (c16911.readInt() == 830747697) {
                            int i = c16911.readInt();
                            c20890.f67864 = new ArrayList(i);
                            byte[] bArr = new byte[1024];
                            for (int i2 = 0; i2 < i; i2++) {
                                int i3 = c16911.read();
                                if (i3 == -1) {
                                    throw new EOFException();
                                }
                                if (i3 != 0) {
                                    c20890.f67873 = true;
                                    c20890.f67864.add(new C15246(c16911.m39598(bArr), c16911.m39598(bArr)));
                                } else {
                                    c20890.f67864.add(new C15246(c16911.m39598(bArr)));
                                }
                            }
                            c20890.m46993();
                            AbstractC20745 abstractC20745M33321 = c20890.f67871.m16575().m33320("strings_changed");
                            if (c20890.f67873) {
                                abstractC20745M33321.getClass();
                                abstractC20745M33321.m46704(new byte[]{1}, 0, 1);
                            } else {
                                abstractC20745M33321.mo24647();
                            }
                            c20890.f67870.notifyDataSetChanged();
                            c16911.close();
                            return;
                        }
                        c16911.close();
                    } catch (Throwable th) {
                        try {
                            c16911.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    C18377 c18377 = c20890.f67865;
                    if (c18377 != null) {
                        c18377.m42627(th3);
                    }
                }
            }
            new C13129(c20890, R.string.MT_Protector).m10243();
        }
    }

    @Override // l.ComponentCallbacksC22654
    public final void onViewCreated(View view, Bundle bundle) {
        C17492 c17492 = (C17492) view.findViewById(R.id.MT_Protector);
        this.f67869 = c17492;
        c17492.setTag("RecyclerView3");
        this.f67869.setAdapter(this.f67870);
        this.f67865.m42630(getViewLifecycleOwner(), new C2544(this));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46986(C20890 c20890) {
        c20890.f67869.scrollToPosition(0);
        c20890.f67870.m44542();
    }

    @Override // l.ComponentCallbacksC22654
    public final void onDestroyView() {
        super.onDestroyView();
        this.f67869.setAdapter(null);
        this.f67869 = null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m46996() {
        m46974(this.f67864);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m46974(List list) {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C11267(this.f67871.m16575().m33320("strings").mo33976(false)));
            try {
                C23967.m52796(bufferedOutputStream, 830747697);
                C23967.m52796(bufferedOutputStream, list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C15246 c15246 = (C15246) it.next();
                    bufferedOutputStream.write(c15246.f49711 ? 255 : 0);
                    String str = c15246.f49712;
                    C23967.m52796(bufferedOutputStream, C23967.m52794(str));
                    C23967.m52797(bufferedOutputStream, str);
                    if (c15246.f49711) {
                        String str2 = c15246.f49710;
                        C23967.m52796(bufferedOutputStream, C23967.m52794(str2));
                        C23967.m52797(bufferedOutputStream, str2);
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
            C18377 c18377 = this.f67865;
            if (c18377 != null) {
                c18377.m42627((Throwable) e);
            }
        }
        AbstractC20745 abstractC20745M33320 = this.f67871.m16575().m33320("strings_changed");
        if (this.f67873) {
            try {
                abstractC20745M33320.getClass();
                abstractC20745M33320.m46704(new byte[]{1}, 0, 1);
                return;
            } catch (IOException e2) {
                C18377 c18378 = this.f67865;
                if (c18378 != null) {
                    c18378.m42627((Throwable) e2);
                    return;
                }
                return;
            }
        }
        abstractC20745M33320.mo24647();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m46991(C20890 c20890) {
        AbstractC20745 abstractC20745M33320 = c20890.f67871.m16575().m33320("stringsFilter");
        if (!c20890.f67867) {
            abstractC20745M33320.mo24647();
            return;
        }
        C11018 c11018M43576 = C18917.m43576(1143374470);
        c11018M43576.m27782((CharSequence) c20890.f67866);
        c11018M43576.writeInt(c20890.f67872);
        for (int i = 0; i < c20890.f67872; i++) {
            c11018M43576.writeInt(c20890.f67868[i]);
        }
        try {
            abstractC20745M33320.m46697(c11018M43576);
        } catch (IOException e) {
            if (c20890.f67865 != null) {
                c20890.f67865.m42627((Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m46993() {
        AbstractC20745 abstractC20745M33320 = this.f67871.m16575().m33320("stringsFilter");
        if (abstractC20745M33320.mo33975()) {
            C17367 c17367M46713 = abstractC20745M33320.m46713();
            if (c17367M46713.readInt() == 1143374470) {
                this.f67867 = true;
                this.f67866 = c17367M46713.m40442();
                int i = c17367M46713.readInt();
                this.f67872 = i;
                int[] iArr = this.f67868;
                if (iArr == null || iArr.length < i) {
                    this.f67868 = new int[i];
                }
                for (int i2 = 0; i2 < this.f67872; i2++) {
                    this.f67868[i2] = c17367M46713.readInt();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m46990(C20890 c20890) {
        new C3955(c20890, (AbstractActivityC12483) c20890.requireActivity(), c20890.f67867, C21905.m48704()).m15185();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static void m46989(C20890 c20890) {
        ActivityC5677 activityC5677 = (ActivityC5677) c20890.requireActivity();
        C1777 c1777 = new C1777(activityC5677);
        c1777.m5837(R.string.MT_Protector);
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        final C23007 c23007 = new C23007(c20890, c1777, activityC5677);
        final C21445 c21445 = new C21445();
        for (C15246 c15246 : c20890.f67864) {
            if (c15246.f49711) {
                c21445.put(c15246.f49712, c15246.f49710);
            }
        }
        final C6094 c6094 = c20890.f67871;
        new Thread(new Runnable() { // from class: l.ۙۨۜ
            @Override // java.lang.Runnable
            public final void run() {
                final C20494 c20494 = new C20494();
                final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                C6094 c6095 = c6094;
                c6095.m16539(concurrentLinkedQueue, "", true, (Predicate) null);
                final InterfaceC16261 interfaceC16261 = c23007;
                interfaceC16261.mo15795(0);
                final C8516 c8516 = new C8516(concurrentLinkedQueue.size());
                c8516.m22241(new C16041(interfaceC16261));
                final C21445 c21446 = c21445;
                Runnable runnable = new Runnable() { // from class: l.ۨۨۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9354 interfaceC9354;
                        String string;
                        while (true) {
                            ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                            if (concurrentLinkedQueue2.isEmpty() || (interfaceC9354 = (InterfaceC9354) concurrentLinkedQueue2.poll()) == null || interfaceC16261.mo15792()) {
                                return;
                            }
                            c8516.m22242(1);
                            String strMo23998 = interfaceC9354.mo23998();
                            C5763 c5763 = new C5763(strMo23998);
                            C2093 c2093 = new C2093(strMo23998.length());
                            int i = 0;
                            int i2 = 0;
                            while (true) {
                                string = null;
                                if (!c5763.m15885()) {
                                    break;
                                }
                                String str = (String) c21446.getOrDefault(c5763.f19580, null);
                                if (str != null) {
                                    c2093.append((CharSequence) strMo23998, i2, c5763.f19577);
                                    try {
                                        C9461.m24219(c2093, str);
                                    } catch (IOException unused) {
                                    }
                                    i2 = c5763.f19576;
                                    i++;
                                }
                            }
                            if (i != 0) {
                                c20494.m46298(i);
                                if (i2 < strMo23998.length()) {
                                    c2093.append((CharSequence) strMo23998, i2, strMo23998.length());
                                }
                                string = c2093.toString();
                            }
                            if (string != null) {
                                interfaceC9354.mo24000(string);
                            }
                        }
                    }
                };
                c6095.m16557();
                c6095.m16548(false);
                C12733.m31637((int) (C5464.f18831 * 0.66f), runnable);
                c6095.m16548(true);
                c6095.m16573();
                C16737.m39273(new RunnableC2503(0, interfaceC16261, c20494));
            }
        }).start();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC0414 m46998() {
        return this.f67870;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List m46997() {
        return this.f67864;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m46995() {
        boolean z;
        Iterator it = this.f67864.iterator();
        while (it.hasNext()) {
            if (((C15246) it.next()).f49711) {
                z = true;
                this.f67873 = z;
            }
        }
        z = false;
        this.f67873 = z;
    }
}
