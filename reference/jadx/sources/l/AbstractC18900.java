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

/* JADX INFO: renamed from: l.ᩳۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAJH */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18900 implements InterfaceC7509 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public WeakReference f61320;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Bundle f61322;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C20168 f61327;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f61328;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f61329;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f61331;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public CharSequence f61332;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f61333;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C12187 f61340;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f61319 = new AtomicInteger();

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final Handler f61318 = new HandlerC14424(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final Object f61334 = new Object();

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public EnumC6222 f61337 = EnumC6222.CREATED;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f61339 = new WeakReference(this);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17930 f61338 = new C17930(this);

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f61330 = -1;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f61324 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f61323 = new AtomicBoolean();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public CountDownLatch f61321 = new CountDownLatch(1);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f61336 = new ArrayList();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ArrayList f61326 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f61335 = new ArrayList();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C24720 f61325 = C24720.m55194(20);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo2528();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187);

    /* JADX INFO: renamed from: ۙ */
    public void mo2530(AbstractActivityC17204 abstractActivityC17204, C12187 c12187, boolean z) {
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract C12187 mo2531();

    /* JADX INFO: renamed from: ܶۙ */
    public abstract CharSequence mo2532();

    /* JADX INFO: renamed from: ᩶ۙ */
    public boolean mo29449() {
        return !(this instanceof C5762);
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract DialogInterfaceC8327 mo4862(AbstractActivityC17204 abstractActivityC17204);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo2533(C12187 c12187);

    /* JADX INFO: renamed from: ᩺ */
    public abstract C11983 mo2534();

    /* JADX INFO: renamed from: ᩻ */
    public boolean mo2535() {
        return !(this instanceof C25085);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo36391(Intent intent) {
        this.f61328 = intent.getIntExtra("TaskId", -1);
        this.f61322 = intent.getBundleExtra("TaskArgument");
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m43844() {
        return this.f61328;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Bundle m43830() {
        return this.f61322;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m43828(String str) {
        if (!this.f61322.containsKey(str)) {
            throw new RuntimeException("Key not found in input data");
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String[] m43831(String str) {
        C20348 c20348M46740 = C20348.m46740(m43829(str));
        int i = c20348M46740.readInt();
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = c20348M46740.m46756();
        }
        return strArr;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m43865(String str) {
        m43828(str);
        String string = this.f61322.getString(str);
        C17359.requireNonNull(string);
        return string;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String m43840(String str) {
        return C11293.m28558(m43865(str));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m43850(String str) {
        return C11293.m28548(m43865(str));
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m43860(String str) {
        return C14584.m35193(m43865(str), new String[0]);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m43867(String str) {
        return this.f61322.getString(str);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m43854(String str) {
        m43828(str);
        return this.f61322.getInt(str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m43855(String str) {
        m43828(str);
        return this.f61322.getLong(str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m43847(String str) {
        m43828(str);
        return this.f61322.getBoolean(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m43829(String str) {
        m43828(str);
        Object obj = this.f61322.get(str);
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (!(obj instanceof String)) {
            throw new RuntimeException(C14483.m34971("Unknown: ", obj));
        }
        AbstractC22044 abstractC22044M35193 = C14584.m35193((String) obj, new String[0]);
        try {
            byte[] bArrM49865 = abstractC22044M35193.m49865();
            this.f61326.add(abstractC22044M35193);
            return bArrM49865;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Serializable m43853(String str) {
        m43828(str);
        return this.f61322.getSerializable(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7629 m43838() {
        AbstractC7629 abstractC7629M42101 = C18070.m42101(m43829("ARG_STATELESS_VISITOR"), true);
        if (abstractC7629M42101 instanceof AutoCloseable) {
            this.f61335.add((AutoCloseable) abstractC7629M42101);
        }
        return abstractC7629M42101;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7629 m43848() {
        AbstractC7629 abstractC7629M42101 = C18070.m42101(m43829("ARG_STATELESS_VISITOR2"), true);
        if (abstractC7629M42101 instanceof AutoCloseable) {
            this.f61335.add((AutoCloseable) abstractC7629M42101);
        }
        return abstractC7629M42101;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C9651 m43843() {
        byte[] byteArray = this.f61322.getByteArray("ARG_SIGNATURE_OPTIONS");
        if (byteArray == null) {
            return null;
        }
        C20348 c20348 = new C20348(byteArray);
        return new C9651(AbstractC14806.m35650(c20348.m46748()), EnumC6670.values()[c20348.readByte()], c20348.m46757(), c20348.m46753());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m43863(C8614 c8614) {
        return m43865("ARG_CURRENT_WINDOW_DIGEST").equals(c8614.m23190());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43837(C8614 c8614) {
        return m43865("ARG_ANOTHER_WINDOW_DIGEST").equals(c8614.m23190());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43833(EnumC6222 enumC6222) {
        if (enumC6222 == EnumC6222.FINISHED) {
            try {
                this.f61321.await();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this.f61334) {
            this.f61337 = enumC6222;
        }
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43861() {
        return this.f61337 == EnumC6222.FINISHED;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m43845(C12187 c12187) {
        this.f61340 = c12187;
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final C12187 m43869() {
        return this.f61340;
    }

    public void cancel() {
        this.f61333 = true;
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        if (this.f61333) {
            return true;
        }
        C20168 c20168 = this.f61327;
        return c20168 != null && c20168.mo23076() == EnumC2619.DESTROYED;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17930 m43851() {
        return this.f61338;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43834(C7713 c7713) {
        if (this.f61337 == EnumC6222.FINISHED) {
            throw new IllegalStateException("Can not add FinallyListener after finished");
        }
        this.f61336.add(c7713);
    }

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final void m43842() {
        AbstractActivityC17204 abstractActivityC17204Mo16840 = mo16840();
        if (abstractActivityC17204Mo16840 != null) {
            C21576.m49068(new RunnableC24122(0, this, abstractActivityC17204Mo16840));
        } else {
            this.f61321.countDown();
            C13678.m33468(this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43827(AbstractC18900 abstractC18900, AbstractActivityC17204 abstractActivityC17204) {
        abstractC18900.m43826(abstractActivityC17204, true);
        abstractC18900.f61321.countDown();
        C13678.m33468(abstractC18900);
    }

    /* JADX INFO: renamed from: ۙ */
    public C12187 mo4494(Exception exc) {
        return C12187.m30465(exc);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43835(C12187 c12187) {
        C20065 c20065M117;
        boolean zM46140;
        DialogInterfaceC8327 dialogInterfaceC8327M43841 = m43841();
        ArrayList arrayList = this.f61336;
        if (dialogInterfaceC8327M43841 != null && dialogInterfaceC8327M43841.m22434()) {
            if (f61318.hasMessages(this.f61328)) {
                C21576.m49069(new RunnableC22205(1, dialogInterfaceC8327M43841), 50L);
            } else {
                dialogInterfaceC8327M43841.dismiss();
            }
            AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) C3200.m10534(dialogInterfaceC8327M43841.m22422());
            C17359.requireNonNull(abstractActivityC17204);
            boolean z = this.f61329;
            mo2530(abstractActivityC17204, c12187, z);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC0255) it.next()).mo1752(abstractActivityC17204, c12187, z);
            }
            if (c12187.m30472() && mo29449()) {
                c12187.m30471(abstractActivityC17204);
            }
        } else if (c12187.m30472() && mo29449()) {
            PendingIntent activity = PendingIntent.getActivity(C21576.m49084(), 0, new Intent(C21576.m49084(), (Class<?>) ActivityC0451.class), 67108864);
            C3558 c3558 = new C3558(C21576.m49084(), "MTaskService3");
            c3558.m11599();
            c3558.m11602();
            c3558.m11594(C21576.m49088(R.string.MT_Protector));
            c3558.m11593(mo2532());
            c3558.m11591(activity);
            c3558.m11601();
            c3558.m11596(true);
            ServiceC19096.f61816.notify(this.f61328 + 10000, c3558.m11589());
        }
        if (c12187.m30472()) {
            C13678.m33458(this);
        }
        Main mainM18052 = C6331.m18052();
        if (mainM18052 != null && (c20065M117 = mainM18052.m117()) != null) {
            if (this.f61322.containsKey("ARG_CURRENT_WINDOW_LEFT")) {
                zM46140 = this.f61322.getBoolean("ARG_CURRENT_WINDOW_LEFT");
            } else {
                zM46140 = c20065M117.m46140();
            }
            mo2529(mainM18052, zM46140 ? c20065M117.m46139() : c20065M117.m46182(), !zM46140 ? c20065M117.m46139() : c20065M117.m46182(), c12187);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC0255) it2.next()).getClass();
            }
        }
        mo2533(c12187);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((InterfaceC0255) it3.next()).getClass();
        }
        Iterator it4 = this.f61326.iterator();
        while (it4.hasNext()) {
            ((AbstractC22044) it4.next()).mo4296();
        }
        Iterator it5 = this.f61335.iterator();
        while (it5.hasNext()) {
            C20244.m46520((AutoCloseable) it5.next());
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m43846(AbstractActivityC17204 abstractActivityC17204) {
        m43826(abstractActivityC17204, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43826(AbstractActivityC17204 abstractActivityC17204, boolean z) {
        synchronized (this.f61334) {
            if (m43861()) {
                return;
            }
            DialogInterfaceC8327 dialogInterfaceC8327M43841 = m43841();
            if (dialogInterfaceC8327M43841 != null && dialogInterfaceC8327M43841.m22434()) {
                if (C3200.m10534(dialogInterfaceC8327M43841.m22422()) == abstractActivityC17204) {
                    return;
                } else {
                    dialogInterfaceC8327M43841.dismiss();
                }
            }
            this.f61329 = z;
            mo36389();
            DialogInterfaceC8327 dialogInterfaceC8327Mo4862 = mo4862(abstractActivityC17204);
            abstractActivityC17204.m40406(dialogInterfaceC8327Mo4862);
            this.f61320 = new WeakReference(dialogInterfaceC8327Mo4862);
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public AbstractActivityC17204 mo16840() {
        return C6331.m18052();
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 m43841() {
        WeakReference weakReference = this.f61320;
        if (weakReference == null) {
            return null;
        }
        return (DialogInterfaceC8327) weakReference.get();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m43868(int i) {
        mo16837(C21576.m49088(i));
    }

    /* JADX INFO: renamed from: ۘ */
    public void mo16837(String str) {
        this.f61331 = str;
        this.f61324.set(true);
        m43856();
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m43866() {
        return this.f61331;
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43852() {
        return this.f61324.compareAndSet(true, false);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m43859(int i) {
        mo29447(C21576.m49088(i));
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo29447(CharSequence charSequence) {
        this.f61332 = charSequence;
        this.f61323.set(true);
        m43856();
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m43839() {
        return this.f61332;
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43832() {
        return this.f61323.compareAndSet(true, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43862(long j, long j2) {
        mo16839(C3374.m11075(j, j2));
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo16839(int i) {
        if (this.f61330 != i) {
            this.f61330 = i;
            m43856();
        }
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final int m43849() {
        return this.f61330;
    }

    /* JADX INFO: renamed from: ֡ۙ */
    public void mo36389() {
        this.f61324.set(true);
        this.f61323.set(true);
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final void m43856() {
        if (this.f61325.m55199()) {
            int i = this.f61328;
            WeakReference weakReference = this.f61339;
            Handler handler = f61318;
            handler.sendMessageDelayed(handler.obtainMessage(i, weakReference), 20L);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43836(AbstractActivityC17204 abstractActivityC17204) {
        AbstractC8585 lifecycle = abstractActivityC17204.getLifecycle();
        if (lifecycle.mo23076() == EnumC2619.DESTROYED) {
            cancel();
        } else {
            this.f61327 = (C20168) lifecycle;
        }
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final C12187 m43857() {
        return mo924() ? C12187.m30469() : C12187.m30468();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m43824(String[] strArr) {
        return (List) C13847.stream(strArr).map(new C3984(0)).collect(C2025.toList());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC18900 m43858() {
        C21138 c21138 = new C21138();
        c21138.f61328 = this.f61328;
        c21138.f61340 = this.f61340;
        c21138.f61331 = C21576.m49088(R.string.MT_Protector);
        c21138.f61332 = mo2532();
        c21138.f61337 = EnumC6222.FINISHED;
        return c21138;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC8161 mo43864() {
        m43868(R.string.MT_Protector);
        mo16839(0);
        return new C18154(this);
    }
}
