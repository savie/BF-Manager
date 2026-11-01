package l;

import android.os.Build;
import android.os.SystemClock;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩷ۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: OAIH */
/* JADX INFO: loaded from: classes5.dex */
public class C20658 extends AbstractC0656 {

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f67232 = 0;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public C21026 f67236;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public C3599 f67238;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public AbstractC12233 f67240;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f67241;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public boolean f67237 = C16737.m39280();

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public List f67234 = C11445.m28558();

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public AtomicReference f67243 = new AtomicReference();

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public List f67233 = C11445.m28558();

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public C16842 f67235 = new C16842(0);

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C20062 f67239 = new C20062();

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC8327 f67242 = new C10075(this);

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5719;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(this.f67241 ? R.string.MT_Protector : R.string.MT_Protector, m41567("targetPath"));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        mo2982("...");
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws Exception {
        AtomicReference atomicReference;
        String[] strArrM41566 = m41566("ARG_PATHS");
        String strM41585 = m41585("targetPath");
        this.f67241 = m41573("moveMode");
        this.f67240 = (AbstractC12233) m41560();
        C2462.m7541(strM41585, EnumC11636.MODIFY_DIRECTORY);
        C5553.m15313(strM41585, new String[0]).m46739();
        C21026 c21026M47357 = C21026.m47357(strM41585, new C16608(false), this.f67242);
        this.f67236 = c21026M47357;
        if (!this.f67240.f40874.f40387) {
            c21026M47357.m47389();
        }
        this.f67236.m47381(strArrM41566, (AbstractC9677) this.f67240, false, true);
        if (Build.VERSION.SDK_INT >= 30) {
            C7318 c7318 = new C7318();
            Iterator it = this.f67236.m47385().iterator();
            while (it.hasNext()) {
                ((AbstractC10444) it.next()).m26367(c7318, true);
            }
            if (!c7318.m19525()) {
                cancel();
                return C5202.m14378();
            }
        }
        m41591(this.f67241 ? R.string.MT_Protector : R.string.MT_Protector);
        mo2983(this.f67236);
        m2974(true);
        this.f67239.m45431();
        this.f67235.m39499();
        this.f67238 = new C3599(this.f67240, new C7252(this));
        Iterator it2 = this.f67236.m47385().iterator();
        do {
            boolean zHasNext = it2.hasNext();
            atomicReference = this.f67243;
            if (!zHasNext) {
                break;
            }
            m46510((AbstractC10444) it2.next());
            if (mo2357()) {
                break;
            }
        } while (atomicReference.get() == null);
        if (mo2357()) {
            return C5202.m14378();
        }
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        this.f67238.m10682(new InterfaceC0777() { // from class: l.ۡۚ֨
            @Override // l.InterfaceC0777
            /* JADX INFO: renamed from: ۙ */
            public final void mo3329(C21239 c21239, boolean z) {
                C20658 c20658 = this.f29858;
                AtomicReference atomicReference2 = c20658.f67243;
                if (!z) {
                    Exception exc = (Exception) c21239.f69172.get();
                    if (exc != null) {
                        while (!atomicReference2.compareAndSet(null, exc) && atomicReference2.get() == null) {
                        }
                        return;
                    }
                    return;
                }
                C5222 c5222 = c21239.f69186;
                AbstractC20745 abstractC20745 = c21239.f69178;
                if (c5222 != null) {
                    c5222.m14402(abstractC20745);
                }
                if (c20658.f67237 && abstractC20745.mo8448()) {
                    abstractC20745.mo32855(c21239.f69174);
                }
                C22252.m49408(abstractC20745.mo33986(), true);
                Object obj = c21239.f69181;
                if (obj != null) {
                    c20658.f67233.add((String) obj);
                }
                if (c20658.f67241 && !c20658.mo2357()) {
                    try {
                        c20658.f67240.m30348(c21239.f69180, false);
                    } catch (Exception e) {
                        while (!atomicReference2.compareAndSet(null, e) && atomicReference2.get() == null) {
                        }
                    }
                }
                c20658.f67236.m10992();
                c20658.mo2983(c20658.f67236);
                c20658.mo21455(c20658.f67236.m10996());
            }
        });
        this.f67238.m10684();
        if (mo2357()) {
            return C5202.m14378();
        }
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        if (this.f67241) {
            Iterator it3 = this.f67236.m47385().iterator();
            while (it3.hasNext()) {
                m46511((AbstractC10444) it3.next());
                if (mo2357()) {
                    return C5202.m14378();
                }
            }
        }
        Iterator it4 = this.f67234.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
            if (mo2357()) {
                return C5202.m14378();
            }
        }
        SystemClock.sleep(100L);
        return C5202.m14379();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m46510(AbstractC10444 abstractC10444) {
        C5222 c5222;
        String str;
        boolean zM26376;
        boolean z;
        AbstractC20745 abstractC20745M46693;
        if (mo2357() || this.f67243.get() != null) {
            return;
        }
        mo2982(abstractC10444.m26393());
        abstractC10444.m26391();
        try {
            boolean zM26387 = abstractC10444.m26387();
            C20062 c20062 = this.f67239;
            if (zM26387) {
                if (!abstractC10444.m26389()) {
                    AbstractC20745 abstractC20745M26394 = abstractC10444.m26394();
                    c20062.m45432(abstractC20745M26394, EnumC11636.MODIFY_FILE);
                    abstractC20745M26394.m46739();
                    C5222 c5222M26377 = abstractC10444.m26377();
                    if (c5222M26377 != null) {
                        c5222M26377.m14402(abstractC20745M26394);
                    }
                    if (this.f67237 && abstractC20745M26394.mo8448()) {
                        this.f67234.add(new RunnableC19976(2, abstractC20745M26394, abstractC10444));
                    }
                }
                abstractC10444.m26373();
                this.f67236.m10992();
                if (abstractC10444.m26372() != null) {
                    this.f67233.add((String) abstractC10444.m26372());
                }
                Iterator it = abstractC10444.mo23365().m44704().iterator();
                while (it.hasNext()) {
                    m46510((AbstractC10444) it.next());
                }
            } else {
                String strM26362 = abstractC10444.m26362();
                C5222 c5222M26378 = abstractC10444.m26377();
                String name = abstractC10444.m26372() != null ? (String) abstractC10444.m26372() : null;
                if (!abstractC10444.m26389()) {
                    abstractC20745M46693 = abstractC10444.m26394();
                    c20062.m45432(abstractC20745M46693, EnumC11636.MODIFY_FILE);
                } else {
                    if (!abstractC10444.m26388()) {
                        AbstractC20745 abstractC20745M26395 = abstractC10444.m26394();
                        c20062.m45432(abstractC20745M26395, EnumC11636.MODIFY_FILE);
                        C5222 c5223 = new C5222();
                        c5223.m14408(abstractC20745M26395);
                        c5222 = c5223;
                        str = name;
                        zM26376 = abstractC10444.m26376();
                        z = true;
                        abstractC20745M46693 = abstractC20745M26395;
                    } else {
                        abstractC20745M46693 = abstractC10444.m26394().m46693(true);
                        c20062.m45432(abstractC20745M46693, EnumC11636.MODIFY_FILE);
                        if (name != null) {
                            name = abstractC20745M46693.getName();
                            abstractC10444.m26361(name);
                        }
                    }
                    this.f67238.m10681(abstractC10444.m26393(), strM26362, abstractC20745M46693, abstractC10444.m26359(), abstractC10444.m26392(), str, c5222, z, zM26376);
                }
                c5222 = c5222M26378;
                str = name;
                z = false;
                zM26376 = false;
                this.f67238.m10681(abstractC10444.m26393(), strM26362, abstractC20745M46693, abstractC10444.m26359(), abstractC10444.m26392(), str, c5222, z, zM26376);
            }
        } finally {
            abstractC10444.m26373();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m46511(AbstractC10444 abstractC10444) {
        if (abstractC10444.m26387()) {
            C19616 c19616Mo23365 = abstractC10444.mo23365();
            if (c19616Mo23365.m44706()) {
                Iterator it = c19616Mo23365.m44704().iterator();
                while (it.hasNext()) {
                    m46511((AbstractC10444) it.next());
                }
            } else {
                m41591(R.string.MT_Protector);
                mo41554(abstractC10444.m26393());
                C10781.m27079(this.f67240, c19616Mo23365);
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (c5202.m14380() && m41579(c11545)) {
            c11545.m28831();
            if (this.f67241) {
                c11545.m28830();
            }
        }
        List list = this.f67233;
        if (list.isEmpty() || !m41559(c11546)) {
            return;
        }
        c11546.m28777((Collection) list);
        c11546.m28830();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C3599 c3599 = this.f67238;
        if (c3599 != null && !c3599.m10683()) {
            this.f67238.m10685();
        }
        this.f67235.m39498();
        C21094.m47530();
        if (this.f67241) {
            C21094.m47529(this.f67240.mo10276());
        }
    }
}
