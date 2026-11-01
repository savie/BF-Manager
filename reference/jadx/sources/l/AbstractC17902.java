package l;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ᩳ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAJH */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17902 implements InterfaceC5614 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f56692;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4245 f56693;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public C5202 f56694;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public CharSequence f56695;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f56698;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Bundle f56705;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f56706;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public WeakReference f56707;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f56711;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f56690 = new AtomicInteger();

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final Handler f56689 = new HandlerC3790(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final Object f56710 = new Object();

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public EnumC22136 f56697 = EnumC22136.CREATED;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f56704 = new WeakReference(this);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9186 f56709 = new C9186(this);

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f56701 = -1;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f56703 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f56696 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public CountDownLatch f56700 = new CountDownLatch(1);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f56708 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f56702 = new ArrayList();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f56691 = new ArrayList();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C22959 f56699 = C22959.m50799(20);

    /* JADX INFO: renamed from: ۘ */
    public abstract void mo3075();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202);

    /* JADX INFO: renamed from: ۙ */
    public void mo16350(AbstractActivityC12483 abstractActivityC12483, C5202 c5202, boolean z) {
    }

    /* JADX INFO: renamed from: ۜ */
    public abstract C5202 mo3077();

    /* JADX INFO: renamed from: ۟ */
    public abstract C14600 mo3078();

    /* JADX INFO: renamed from: ܰ */
    public abstract DialogInterfaceC19356 mo2981(AbstractActivityC12483 abstractActivityC12483);

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo3079(C5202 c5202);

    /* JADX INFO: renamed from: ᩳۙ */
    public abstract CharSequence mo3080();

    /* JADX INFO: renamed from: ᩶ۙ */
    public boolean mo18332() {
        return !(this instanceof C22961);
    }

    /* JADX INFO: renamed from: ᩺ */
    public boolean mo12168() {
        return !(this instanceof C18861);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo2976(Intent intent) {
        this.f56711 = intent.getIntExtra("TaskId", -1);
        this.f56705 = intent.getBundleExtra("TaskArgument");
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m41563() {
        return this.f56711;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Bundle m41580() {
        return this.f56705;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m41551(String str) {
        if (!this.f56705.containsKey(str)) {
            throw new RuntimeException("Key not found in input data");
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String[] m41566(String str) {
        C17367 c17367M40441 = C17367.m40441(m41553(str));
        int i = c17367M40441.readInt();
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = c17367M40441.m40442();
        }
        return strArr;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m41585(String str) {
        m41551(str);
        String string = this.f56705.getString(str);
        C13638.requireNonNull(string);
        return string;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m41569(String str) {
        return C6730.m18175(m41585(str));
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m41567(String str) {
        return C6730.m18161(m41585(str));
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m41587(String str) {
        return C5553.m15313(m41585(str), new String[0]);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String m41565(String str) {
        return this.f56705.getString(str);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m41581(String str) {
        m41551(str);
        return this.f56705.getInt(str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m41590(String str) {
        m41551(str);
        return this.f56705.getLong(str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m41573(String str) {
        m41551(str);
        return this.f56705.getBoolean(str);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final byte[] m41553(String str) {
        m41551(str);
        Object obj = this.f56705.get(str);
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (!(obj instanceof String)) {
            throw new RuntimeException(C9023.m23354(obj, "Unknown: "));
        }
        AbstractC20745 abstractC20745M15313 = C5553.m15313((String) obj, new String[0]);
        try {
            byte[] bArrM46727 = abstractC20745M15313.m46727();
            this.f56702.add(abstractC20745M15313);
            return bArrM46727;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Serializable m41584(String str) {
        m41551(str);
        return this.f56705.getSerializable(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9677 m41560() {
        AbstractC9677 abstractC9677M35094 = C14616.m35094(m41553("ARG_STATELESS_VISITOR"), true);
        if (abstractC9677M35094 instanceof AutoCloseable) {
            this.f56691.add((AutoCloseable) abstractC9677M35094);
        }
        return abstractC9677M35094;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9677 m41574() {
        AbstractC9677 abstractC9677M35094 = C14616.m35094(m41553("ARG_STATELESS_VISITOR2"), true);
        if (abstractC9677M35094 instanceof AutoCloseable) {
            this.f56691.add((AutoCloseable) abstractC9677M35094);
        }
        return abstractC9677M35094;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C14558 m41593() {
        byte[] byteArray = this.f56705.getByteArray("ARG_SIGNATURE_OPTIONS");
        if (byteArray == null) {
            return null;
        }
        C17367 c17367 = new C17367(byteArray);
        return new C14558(AbstractC17131.m40008(c17367.m40451()), EnumC7501.values()[c17367.readByte()], c17367.m40457(), c17367.m40461());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m41579(C11545 c11545) {
        return m41585("ARG_CURRENT_WINDOW_DIGEST").equals(c11545.m28808());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41559(C11545 c11545) {
        return m41585("ARG_ANOTHER_WINDOW_DIGEST").equals(c11545.m28808());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41558(EnumC22136 enumC22136) {
        if (enumC22136 == EnumC22136.FINISHED) {
            try {
                this.f56700.await();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this.f56710) {
            this.f56697 = enumC22136;
        }
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41588() {
        return this.f56697 == EnumC22136.FINISHED;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m41571(C5202 c5202) {
        this.f56694 = c5202;
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final C5202 m41592() {
        return this.f56694;
    }

    public void cancel() {
        this.f56706 = true;
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        if (this.f56706) {
            return true;
        }
        C4245 c4245 = this.f56693;
        return c4245 != null && c4245.mo9170() == EnumC9414.DESTROYED;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C9186 m41568() {
        return this.f56709;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41557(C21430 c21430) {
        if (this.f56697 == EnumC22136.FINISHED) {
            throw new IllegalStateException("Can not add FinallyListener after finished");
        }
        this.f56708.add(c21430);
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final void m41575() {
        AbstractActivityC12483 abstractActivityC12483Mo21456 = mo21456();
        if (abstractActivityC12483Mo21456 != null) {
            C16737.m39273(new RunnableC0968(0, this, abstractActivityC12483Mo21456));
        } else {
            this.f56700.countDown();
            C20725.m46659(this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41550(AbstractC17902 abstractC17902, AbstractActivityC12483 abstractActivityC12483) {
        abstractC17902.m41549(abstractActivityC12483, true);
        abstractC17902.f56700.countDown();
        C20725.m46659(abstractC17902);
    }

    /* JADX INFO: renamed from: ۙ */
    public C5202 mo6160(Exception exc) {
        return C5202.m14375(exc);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41555(C5202 c5202) {
        C6936 c6936M125;
        boolean zM18640;
        DialogInterfaceC19356 dialogInterfaceC19356M41570 = m41570();
        ArrayList arrayList = this.f56708;
        if (dialogInterfaceC19356M41570 != null && dialogInterfaceC19356M41570.m44375()) {
            if (f56689.hasMessages(this.f56711)) {
                C16737.m39274(new RunnableC3787(3, dialogInterfaceC19356M41570), 50L);
            } else {
                dialogInterfaceC19356M41570.dismiss();
            }
            AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) C8703.m22527(dialogInterfaceC19356M41570.m44363());
            C13638.requireNonNull(abstractActivityC12483);
            boolean z = this.f56698;
            mo16350(abstractActivityC12483, c5202, z);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC15081) it.next()).mo2189(abstractActivityC12483, c5202, z);
            }
            if (c5202.m14383() && mo18332()) {
                c5202.m14382(abstractActivityC12483);
            }
        } else if (c5202.m14383() && mo18332()) {
            PendingIntent activity = PendingIntent.getActivity(C16737.m39277(), 0, new Intent(C16737.m39277(), (Class<?>) ActivityC7007.class), 67108864);
            C3577 c3577 = new C3577(C16737.m39277(), "MTaskService3");
            c3577.m10592();
            c3577.m10580();
            c3577.m10586(C16737.m39288(R.string.MT_Protector));
            c3577.m10585(mo3080());
            c3577.m10583(activity);
            c3577.m10591();
            c3577.m10588(true);
            ServiceC23236.f75398.notify(this.f56711 + 10000, c3577.m10581());
        }
        if (c5202.m14383()) {
            C20725.m46652(this);
        }
        Main mainM47527 = C21094.m47527();
        if (mainM47527 != null && (c6936M125 = mainM47527.m125()) != null) {
            if (this.f56705.containsKey("ARG_CURRENT_WINDOW_LEFT")) {
                zM18640 = this.f56705.getBoolean("ARG_CURRENT_WINDOW_LEFT");
            } else {
                zM18640 = c6936M125.m18640();
            }
            mo3076(mainM47527, zM18640 ? c6936M125.m18623() : c6936M125.m18662(), !zM18640 ? c6936M125.m18623() : c6936M125.m18662(), c5202);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC15081) it2.next()).getClass();
            }
        }
        mo3079(c5202);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((InterfaceC15081) it3.next()).getClass();
        }
        Iterator it4 = this.f56702.iterator();
        while (it4.hasNext()) {
            ((AbstractC20745) it4.next()).mo24647();
        }
        Iterator it5 = this.f56691.iterator();
        while (it5.hasNext()) {
            C19431.m44468((AutoCloseable) it5.next());
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m41572(AbstractActivityC12483 abstractActivityC12483) {
        m41549(abstractActivityC12483, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41549(AbstractActivityC12483 abstractActivityC12483, boolean z) {
        synchronized (this.f56710) {
            if (m41588()) {
                return;
            }
            DialogInterfaceC19356 dialogInterfaceC19356M41570 = m41570();
            if (dialogInterfaceC19356M41570 != null && dialogInterfaceC19356M41570.m44375()) {
                if (C8703.m22527(dialogInterfaceC19356M41570.m44363()) == abstractActivityC12483) {
                    return;
                } else {
                    dialogInterfaceC19356M41570.dismiss();
                }
            }
            this.f56698 = z;
            mo2984();
            DialogInterfaceC19356 dialogInterfaceC19356Mo2981 = mo2981(abstractActivityC12483);
            abstractActivityC12483.m31009(dialogInterfaceC19356Mo2981);
            this.f56707 = new WeakReference(dialogInterfaceC19356Mo2981);
        }
    }

    /* JADX INFO: renamed from: ܶ */
    public AbstractActivityC12483 mo21456() {
        return C21094.m47527();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 m41570() {
        WeakReference weakReference = this.f56707;
        if (weakReference == null) {
            return null;
        }
        return (DialogInterfaceC19356) weakReference.get();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m41591(int i) {
        mo21457(C16737.m39288(i));
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo21457(String str) {
        this.f56692 = str;
        this.f56703.set(true);
        m41552();
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m41586() {
        return this.f56692;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41582() {
        return this.f56703.compareAndSet(true, false);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m41562(int i) {
        mo41554(C16737.m39288(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo41554(CharSequence charSequence) {
        this.f56695 = charSequence;
        this.f56696.set(true);
        m41552();
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m41576() {
        return this.f56695;
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41589() {
        return this.f56696.compareAndSet(true, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m41578(long j, long j2) {
        mo21455(C8516.m22238(j, j2));
    }

    /* JADX INFO: renamed from: ۜ */
    public void mo21455(int i) {
        if (this.f56701 != i) {
            this.f56701 = i;
            m41552();
        }
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final int m41564() {
        return this.f56701;
    }

    /* JADX INFO: renamed from: ܽۙ */
    public void mo2984() {
        this.f56703.set(true);
        this.f56696.set(true);
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final void m41552() {
        if (this.f56699.m50802()) {
            int i = this.f56711;
            WeakReference weakReference = this.f56704;
            Handler handler = f56689;
            handler.sendMessageDelayed(handler.obtainMessage(i, weakReference), 20L);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41556(AbstractActivityC12483 abstractActivityC12483) {
        AbstractC3062 lifecycle = abstractActivityC12483.getLifecycle();
        if (lifecycle.mo9170() == EnumC9414.DESTROYED) {
            cancel();
        } else {
            this.f56693 = (C4245) lifecycle;
        }
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final C5202 m41583() {
        return mo2357() ? C5202.m14378() : C5202.m14379();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m41547(String[] strArr) {
        return (List) C20318.stream(strArr).map(new C12964(0)).collect(C1890.toList());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC17902 m41561() {
        C6613 c6613 = new C6613();
        c6613.f56711 = this.f56711;
        c6613.f56694 = this.f56694;
        c6613.f56692 = C16737.m39288(R.string.MT_Protector);
        c6613.f56695 = mo3080();
        c6613.f56697 = EnumC22136.FINISHED;
        return c6613;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC17379 mo41577() {
        m41591(R.string.MT_Protector);
        mo21455(0);
        return new C22842(this);
    }
}
