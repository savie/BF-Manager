package l;

import android.os.Build;
import android.os.SystemClock;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩹ܶ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: OAIH */
/* JADX INFO: loaded from: classes2.dex */
public class C23640 extends AbstractC15118 {

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f76682 = 0;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C21777 f76683;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f76684;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public C4424 f76690;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public AbstractC18881 f76693;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f76686 = C21576.m49078();

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public List f76691 = C1402.m5127();

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public AtomicReference f76689 = new AtomicReference();

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public List f76688 = C1402.m5127();

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public C12919 f76685 = new C12919(0);

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public C19689 f76687 = new C19689();

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC3678 f76692 = new C17672(this);

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46049;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(this.f76684 ? R.string.MT_Protector : R.string.MT_Protector, m43850("targetPath"));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        mo16841("...");
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws Exception {
        AtomicReference atomicReference;
        String[] strArrM43831 = m43831("ARG_PATHS");
        String strM43865 = m43865("targetPath");
        this.f76684 = m43847("moveMode");
        this.f76693 = (AbstractC18881) m43838();
        C6265.m17912(strM43865, EnumC12230.MODIFY_DIRECTORY);
        C14584.m35193(strM43865, new String[0]).m49853();
        C4424 c4424M14050 = C4424.m14050(strM43865, new C18616(false), this.f76692);
        this.f76690 = c4424M14050;
        if (!this.f76693.f61289.f1125) {
            c4424M14050.m14082();
        }
        this.f76690.m14074(strArrM43831, (AbstractC7629) this.f76693, false, true);
        if (Build.VERSION.SDK_INT >= 30) {
            C20617 c20617 = new C20617();
            Iterator it = this.f76690.m14079().iterator();
            while (it.hasNext()) {
                ((AbstractC6662) it.next()).m18612(c20617, true);
            }
            if (!c20617.m47239()) {
                cancel();
                return C12187.m30469();
            }
        }
        m43868(this.f76684 ? R.string.MT_Protector : R.string.MT_Protector);
        mo16842(this.f76690);
        m36394(true);
        this.f76687.m45389();
        this.f76685.m31997();
        this.f76683 = new C21777(this.f76693, new C16180(this));
        Iterator it2 = this.f76690.m14079().iterator();
        do {
            boolean zHasNext = it2.hasNext();
            atomicReference = this.f76689;
            if (!zHasNext) {
                break;
            }
            m52879((AbstractC6662) it2.next());
            if (mo924()) {
                break;
            }
        } while (atomicReference.get() == null);
        if (mo924()) {
            return C12187.m30469();
        }
        if (atomicReference.get() != null) {
            Exception exc = (Exception) atomicReference.get();
            C22327.m50389(exc);
            throw exc;
        }
        this.f76683.m49385(new InterfaceC14162() { // from class: l.ܺܶ۫
            @Override // l.InterfaceC14162
            /* JADX INFO: renamed from: ۙ */
            public final void mo34399(C15063 c15063, boolean z) {
                C23640 c23640 = this.f55316;
                AtomicReference atomicReference2 = c23640.f76689;
                if (!z) {
                    Exception exc2 = (Exception) c15063.f49180.get();
                    if (exc2 != null) {
                        while (!atomicReference2.compareAndSet(null, exc2) && atomicReference2.get() == null) {
                        }
                        return;
                    }
                    return;
                }
                C24523 c24523 = c15063.f49182;
                AbstractC22044 abstractC22044 = c15063.f49190;
                if (c24523 != null) {
                    c24523.m54797(abstractC22044);
                }
                if (c23640.f76686 && abstractC22044.mo2945()) {
                    abstractC22044.mo2942(c15063.f49172);
                }
                C20108.m46233(abstractC22044.mo4294(), true);
                Object obj = c15063.f49176;
                if (obj != null) {
                    c23640.f76688.add((String) obj);
                }
                if (c23640.f76684 && !c23640.mo924()) {
                    try {
                        c23640.f76693.m43791(c15063.f49179, false);
                    } catch (Exception e) {
                        while (!atomicReference2.compareAndSet(null, e) && atomicReference2.get() == null) {
                        }
                    }
                }
                c23640.f76690.m6376();
                c23640.mo16842(c23640.f76690);
                c23640.mo16839(c23640.f76690.m6380());
            }
        });
        this.f76683.m49387();
        if (mo924()) {
            return C12187.m30469();
        }
        if (atomicReference.get() != null) {
            Exception exc2 = (Exception) atomicReference.get();
            C22327.m50389(exc2);
            throw exc2;
        }
        if (this.f76684) {
            Iterator it3 = this.f76690.m14079().iterator();
            while (it3.hasNext()) {
                m52880((AbstractC6662) it3.next());
                if (mo924()) {
                    return C12187.m30469();
                }
            }
        }
        Iterator it4 = this.f76691.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
            if (mo924()) {
                return C12187.m30469();
            }
        }
        SystemClock.sleep(100L);
        return C12187.m30468();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m52879(AbstractC6662 abstractC6662) {
        C24523 c24523;
        String str;
        boolean zM18616;
        boolean z;
        AbstractC22044 abstractC22044M49839;
        if (mo924() || this.f76689.get() != null) {
            return;
        }
        mo16841(abstractC6662.m18624());
        abstractC6662.m18606();
        try {
            boolean zM18625 = abstractC6662.m18625();
            C19689 c19689 = this.f76687;
            if (zM18625) {
                if (!abstractC6662.m18630()) {
                    AbstractC22044 abstractC22044M18641 = abstractC6662.m18641();
                    c19689.m45390(abstractC22044M18641, EnumC12230.MODIFY_FILE);
                    abstractC22044M18641.m49853();
                    C24523 c24523M18617 = abstractC6662.m18617();
                    if (c24523M18617 != null) {
                        c24523M18617.m54797(abstractC22044M18641);
                    }
                    if (this.f76686 && abstractC22044M18641.mo2945()) {
                        this.f76691.add(new RunnableC15566(1, abstractC22044M18641, abstractC6662));
                    }
                }
                abstractC6662.m18640();
                this.f76690.m6376();
                if (abstractC6662.m18620() != null) {
                    this.f76688.add((String) abstractC6662.m18620());
                }
                Iterator it = abstractC6662.mo18607().m47638().iterator();
                while (it.hasNext()) {
                    m52879((AbstractC6662) it.next());
                }
            } else {
                String strM18604 = abstractC6662.m18604();
                C24523 c24523M18618 = abstractC6662.m18617();
                String name = abstractC6662.m18620() != null ? (String) abstractC6662.m18620() : null;
                if (!abstractC6662.m18630()) {
                    abstractC22044M49839 = abstractC6662.m18641();
                    c19689.m45390(abstractC22044M49839, EnumC12230.MODIFY_FILE);
                } else {
                    if (!abstractC6662.m18639()) {
                        AbstractC22044 abstractC22044M18642 = abstractC6662.m18641();
                        c19689.m45390(abstractC22044M18642, EnumC12230.MODIFY_FILE);
                        C24523 c24524 = new C24523();
                        c24524.m54796(abstractC22044M18642);
                        c24523 = c24524;
                        str = name;
                        zM18616 = abstractC6662.m18616();
                        z = true;
                        abstractC22044M49839 = abstractC22044M18642;
                    } else {
                        abstractC22044M49839 = abstractC6662.m18641().m49839(true);
                        c19689.m45390(abstractC22044M49839, EnumC12230.MODIFY_FILE);
                        if (name != null) {
                            name = abstractC22044M49839.getName();
                            abstractC6662.m18638(name);
                        }
                    }
                    this.f76683.m49384(abstractC6662.m18624(), strM18604, abstractC22044M49839, abstractC6662.m18622(), abstractC6662.m18627(), str, c24523, z, zM18616);
                }
                c24523 = c24523M18618;
                str = name;
                z = false;
                zM18616 = false;
                this.f76683.m49384(abstractC6662.m18624(), strM18604, abstractC22044M49839, abstractC6662.m18622(), abstractC6662.m18627(), str, c24523, z, zM18616);
            }
        } finally {
            abstractC6662.m18640();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m52880(AbstractC6662 abstractC6662) {
        if (abstractC6662.m18625()) {
            C20832 c20832Mo18607 = abstractC6662.mo18607();
            if (c20832Mo18607.m47636()) {
                Iterator it = c20832Mo18607.m47638().iterator();
                while (it.hasNext()) {
                    m52880((AbstractC6662) it.next());
                }
            } else {
                m43868(R.string.MT_Protector);
                mo29447(abstractC6662.m18624());
                C21402.m48669(this.f76693, c20832Mo18607);
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (c12187.m30474() && m43863(c8614)) {
            c8614.m23209();
            if (this.f76684) {
                c8614.m23216();
            }
        }
        List list = this.f76688;
        if (list.isEmpty() || !m43837(c8615)) {
            return;
        }
        c8615.m23176((Collection) list);
        c8615.m23216();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C21777 c21777 = this.f76683;
        if (c21777 != null && !c21777.m49386()) {
            this.f76683.m49388();
        }
        this.f76685.m31996();
        C6331.m18055();
        if (this.f76684) {
            C6331.m18054(this.f76693.mo35579());
        }
    }
}
