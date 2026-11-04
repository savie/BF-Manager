package l;

import android.content.ContextWrapper;
import android.content.Intent;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܰۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB7O */
/* JADX INFO: loaded from: classes5.dex */
public class C14336 extends AbstractC12881 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f45216 = 0;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f45218;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f45219;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f45220;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f45221 = new AtomicInteger();

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f45217 = C6382.f21561.m49877();

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46047;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, m43840("saveAsPath"), C21576.m49088(R.string.MT_Protector));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        m43859(R.string.MT_Protector);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws IOException {
        AbstractC22044 abstractC22044 = this.f45217;
        AbstractC22044 abstractC22044M43860 = m43860("saveAsPath");
        AbstractC22044 abstractC22044M43861 = m43860("inputPath1");
        AbstractC22044 abstractC22044M43862 = m43860("inputPath2");
        AbstractC22044 abstractC22044M49877 = C6382.f21563.m49877();
        this.f45220 = abstractC22044M49877;
        C25179 c25179 = new C25179(abstractC22044M49877);
        try {
            c25179.m56135(0);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c25179.m56119());
            mo29447(C21576.m49059(R.string.MT_Protector, abstractC22044M43861.getName()));
            AbstractC22044 abstractC22044M48107 = C21050.m48107(abstractC22044M43861);
            for (C24648 c24648 : C21664.m49201(abstractC22044M48107, abstractC22044)) {
                c25179.m56124("a/" + c24648.m55001());
                c24648.m55002(bufferedOutputStream);
                bufferedOutputStream.flush();
                if (mo924()) {
                    break;
                }
            }
            abstractC22044.mo4296();
            if (abstractC22044M48107 != abstractC22044M43861) {
                abstractC22044M48107.mo4287();
            }
            if (mo924()) {
                C12187 c12187M30469 = C12187.m30469();
                c25179.close();
                return c12187M30469;
            }
            System.gc();
            mo29447(C21576.m49059(R.string.MT_Protector, abstractC22044M43862.getName()));
            AbstractC22044 abstractC22044M48108 = C21050.m48107(abstractC22044M43862);
            for (C24648 c24649 : C21664.m49201(abstractC22044M48108, abstractC22044)) {
                c25179.m56124("b/" + c24649.m55001());
                c24649.m55002(bufferedOutputStream);
                bufferedOutputStream.flush();
                if (mo924()) {
                    break;
                }
            }
            abstractC22044.mo4296();
            if (abstractC22044M48108 != abstractC22044M43862) {
                abstractC22044M48108.mo4287();
            }
            if (mo924()) {
                C12187 c12187M304610 = C12187.m30469();
                c25179.close();
                return c12187M304610;
            }
            c25179.close();
            m43859(R.string.MT_Protector);
            HashMap map = new HashMap();
            this.f45219 = C6382.f21563.m49876(abstractC22044M43860.getName());
            C22941 c22941 = new C22941(this.f45220);
            try {
                C25179 c251710 = new C25179(this.f45219);
                try {
                    for (C8002 c8002 : c22941.m51742()) {
                        String name = c8002.getName();
                        if (name.startsWith("a/")) {
                            ((C24034) C11392.computeIfAbsent(map, name.substring(2), new C3896())).f77757 = c8002;
                        } else if (name.startsWith("b/")) {
                            ((C24034) C11392.computeIfAbsent(map, name.substring(2), new C3896())).f77758 = c8002;
                        }
                    }
                    C14691 c14691 = new C14691();
                    c14691.m35340("type", "arsc");
                    c14691.m35340("file1", abstractC22044M43861.mo4294());
                    c14691.m35340("file2", abstractC22044M43862.mo4294());
                    c14691.m35340("versionCode", (Object) 26110365);
                    c251710.m56124("info.json");
                    c251710.write(c14691.mo30929().getBytes(Charset.defaultCharset()));
                    for (Map.Entry entry : map.entrySet()) {
                        if (mo924()) {
                            C12187 c12187M304611 = C12187.m30469();
                            c251710.close();
                            c22941.close();
                            return c12187M304611;
                        }
                        String str = (String) entry.getKey();
                        C24034 c24034 = (C24034) entry.getValue();
                        C8002 c8003 = c24034.f77757;
                        AtomicInteger atomicInteger = this.f45221;
                        if (c8003 != null && c24034.f77758 == null) {
                            c251710.m56124("a/" + str);
                            c251710.m56123(c22941.m51727(c24034.f77757));
                            atomicInteger.incrementAndGet();
                        } else if (c8003 == null && c24034.f77758 != null) {
                            c251710.m56124("b/" + str);
                            c251710.m56123(c22941.m51727(c24034.f77758));
                            atomicInteger.incrementAndGet();
                        } else if (!Arrays.equals(c22941.m51731(c8003, (C3374) null), c22941.m51731(c24034.f77758, (C3374) null))) {
                            c251710.m56124("a/" + str);
                            c251710.m56123(c22941.m51727(c24034.f77757));
                            c251710.m56124("b/" + str);
                            c251710.m56123(c22941.m51727(c24034.f77758));
                            atomicInteger.incrementAndGet();
                        }
                        try {
                            c22941.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                    c251710.close();
                    c22941.close();
                    return C12187.m30468();
                } catch (Throwable th2) {
                    try {
                        c251710.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                c22941.close();
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                c25179.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        this.f45218 = true;
        m34759(main, c12187);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34759(ContextWrapper contextWrapper, C12187 c12187) {
        if (c12187.m30474()) {
            if (this.f45221.get() == 0) {
                this.f45219.mo4296();
                C22673.m51159(R.string.MT_Protector);
            } else {
                Intent intent = new Intent(contextWrapper, (Class<?>) ActivityC16677.class);
                intent.setData(this.f45219.m49836());
                intent.putExtra("savedAsPath", m43865("saveAsPath"));
                contextWrapper.startActivity(intent);
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        AbstractC22044 abstractC22044;
        if (!this.f45218) {
            m34759(C21576.m49084(), c12187);
        }
        if (!c12187.m30474() && (abstractC22044 = this.f45219) != null) {
            abstractC22044.mo4296();
        }
        AbstractC22044 abstractC22045 = this.f45220;
        if (abstractC22045 != null) {
            abstractC22045.mo4296();
        }
        this.f45217.mo4296();
        C6331.m18055();
    }
}
