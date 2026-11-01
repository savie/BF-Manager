package l;

import android.view.ViewGroup;
import android.widget.ImageView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C1ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class C12665 extends AbstractC0414 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C19575 f42285;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C1229 f42286;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C11546 f42287;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Main f42288;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C16753 f42290;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C8432 f42291;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C17492 f42292;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23561 f42293;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Runnable f42295;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C11359 f42296;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C16193 f42289 = new C16193();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C16898 f42294 = new C16898(this);

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        AbstractViewOnLongClickListenerC22543 abstractViewOnLongClickListenerC22543 = (AbstractViewOnLongClickListenerC22543) abstractC12554;
        C20426 c20426M31482 = m31482(i);
        AbstractViewOnClickListenerC6314 abstractViewOnClickListenerC6314 = c20426M31482.f66206;
        if (abstractViewOnLongClickListenerC22543.f73516 != C20368.f66000) {
            abstractViewOnLongClickListenerC22543.mo2417(this.f42288.getTheme());
            abstractViewOnLongClickListenerC22543.f73516 = C20368.f66000;
        }
        int i2 = c20426M31482.f66205;
        if (i2 == -1) {
            abstractViewOnClickListenerC6314.mo17412(abstractViewOnLongClickListenerC22543);
        } else {
            abstractViewOnClickListenerC6314.mo15483(abstractViewOnLongClickListenerC22543, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r8v9, types: [l.۟᩷᩹] */
    public C12665(Main main, C11546 c11546) {
        this.f42288 = main;
        this.f42287 = c11546;
        this.f42290 = new C16753(main, this);
        this.f42286 = new C1229(main, C16737.m39288(R.string.MT_Protector), C16737.m39288(R.string.MT_Protector), this, -1);
        this.f42293 = new C23561(main, this);
        this.f42291 = new C8432(main, this);
        this.f42285 = new C19575(main, this);
        this.f42296 = new C11359(main, this);
        C5717.m15767(main, new C4413(1, this));
        C4757.m13196(main, (C7726) new InterfaceC10597() { // from class: l.۟᩷᩹
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                this.f25549.m31485();
            }
        });
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m31485() {
        C16898 c16898 = this.f42294;
        if (c16898 == null) {
            return;
        }
        c16898.m39574();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31488() {
        C11546 c11546 = this.f42287;
        if (c11546.m28846()) {
            return;
        }
        c11546.m28839();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31493(boolean z) {
        C11546 c11546 = this.f42287;
        if (c11546.m28846()) {
            c11546.m28844(z);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m31494() {
        return this.f42287.m28846();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31492(AbstractViewOnLongClickListenerC22543 abstractViewOnLongClickListenerC22543) {
        ImageView imageView = abstractViewOnLongClickListenerC22543.f73518;
        if (imageView == null) {
            return;
        }
        this.f42287.m28840(imageView, abstractViewOnLongClickListenerC22543.mo2418());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31491(C17492 c17492) {
        this.f42292 = c17492;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31497(AbstractViewOnLongClickListenerC22543 abstractViewOnLongClickListenerC22543) {
        Runnable runnable;
        Runnable runnable2;
        if (abstractViewOnLongClickListenerC22543.mo2418()) {
            boolean z = abstractViewOnLongClickListenerC22543 instanceof C11960;
            C16193 c16193 = this.f42289;
            if (z) {
                C17492 c17492 = this.f42292;
                if (c17492 != null && (runnable2 = this.f42295) != null) {
                    c17492.removeCallbacks(runnable2);
                }
                this.f42295 = null;
                c16193.m38287(abstractViewOnLongClickListenerC22543);
            } else {
                C17492 c17493 = this.f42292;
                if (c17493 != null && (runnable = this.f42295) != null) {
                    c17493.removeCallbacks(runnable);
                }
                this.f42295 = null;
                c16193.m38285();
            }
            this.f42287.m28843(abstractViewOnLongClickListenerC22543);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m31498(AbstractC12554 abstractC12554) {
        return this.f42289.m38289(abstractC12554);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31489(C11960 c11960) {
        this.f42289.m38286(c11960, c11960.itemView.getTop());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31496(C11960 c11960) {
        C16193 c16193;
        int iM38284;
        Runnable runnable;
        C17492 c17492 = this.f42292;
        if (c17492 == null || (iM38284 = (c16193 = this.f42289).m38284(c11960)) == -1) {
            return;
        }
        C17492 c17493 = this.f42292;
        if (c17493 != null && (runnable = this.f42295) != null) {
            c17493.removeCallbacks(runnable);
        }
        this.f42295 = null;
        RunnableC21131 runnableC21131 = new RunnableC21131(this, c11960, iM38284, c16193.m38290());
        this.f42295 = runnableC21131;
        c17492.postOnAnimation(runnableC21131);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31490(AbstractC12554 abstractC12554) {
        Runnable runnable;
        C16193 c16193 = this.f42289;
        if (c16193.m38291() != abstractC12554) {
            return;
        }
        C17492 c17492 = this.f42292;
        if (c17492 != null && (runnable = this.f42295) != null) {
            c17492.removeCallbacks(runnable);
        }
        this.f42295 = null;
        c16193.m38285();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31477(C12665 c12665, C11960 c11960, int i) {
        C17492 c17492 = c12665.f42292;
        if (c17492 != null && c12665.f42289.m38291() == c11960 && c11960.itemView.getParent() == c17492) {
            c17492.stopScroll();
            AbstractC1825 itemAnimator = c17492.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.mo5963();
            }
            int top = c11960.itemView.getTop() - i;
            if (top != 0) {
                c17492.scrollBy(0, top);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m31486(AbstractViewOnClickListenerC6314 abstractViewOnClickListenerC6314) {
        return this.f42294.m39572(abstractViewOnClickListenerC6314);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5609 m31487(int i) {
        return this.f42294.m39573(i);
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f42294.m39575();
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Main main = this.f42288;
        switch (i) {
            case 0:
                return new C17603(main, C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false));
            case 1:
                return new C0524(main, C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false), this.f42290);
            case 2:
                return new C19015(main, C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false), this.f42291);
            case 3:
                return new C5921(main, C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false), this.f42293);
            case 4:
                return new C14761(main, C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false), this.f42296);
            case 5:
                return new C8286(main, C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false), this.f42285);
            case 6:
                return new C11960(main, C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false));
            default:
                throw new RuntimeException();
        }
    }

    @Override // l.AbstractC0414
    public final int getItemViewType(int i) {
        C20426 c20426M31482 = m31482(i);
        int i2 = c20426M31482.f66205;
        if (i2 == -1) {
            return 0;
        }
        return ((AbstractViewOnClickListenerC10549) c20426M31482.f66206.f21338.get(i2)).mo13629();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C20426 m31482(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C16898 c16898 = this.f42294;
            if (i2 >= c16898.size()) {
                throw new IllegalArgumentException(C8479.m22141(i, "Unknown drawer position "));
            }
            AbstractViewOnClickListenerC6314 abstractViewOnClickListenerC6314 = c16898.get(i2);
            int iMo17413 = abstractViewOnClickListenerC6314.mo17413();
            if (iMo17413 != 0) {
                int i4 = iMo17413 + i3;
                if (i < i4) {
                    return new C20426(abstractViewOnClickListenerC6314, i == i3 ? -1 : (i - i3) - 1);
                }
                i3 = i4;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19575 m31495() {
        return this.f42285;
    }
}
