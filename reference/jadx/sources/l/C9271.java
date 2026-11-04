package l;

import android.view.ViewGroup;
import android.widget.ImageView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class C9271 extends AbstractC12964 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8887 f30154;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Main f30155;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C25227 f30156;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C4052 f30157;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0873 f30158;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C23994 f30159;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Runnable f30160;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8287 f30163;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C24740 f30164;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C1750 f30165;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C7781 f30162 = new C7781();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1069 f30161 = new C1069(this);

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        AbstractViewOnLongClickListenerC5544 abstractViewOnLongClickListenerC5544 = (AbstractViewOnLongClickListenerC5544) abstractC11800;
        C18968 c18968M24472 = m24472(i);
        AbstractViewOnClickListenerC8526 abstractViewOnClickListenerC8526 = c18968M24472.f61493;
        if (abstractViewOnLongClickListenerC5544.f19261 != C3296.f10776) {
            abstractViewOnLongClickListenerC5544.mo8595(this.f30155.getTheme());
            abstractViewOnLongClickListenerC5544.f19261 = C3296.f10776;
        }
        int i2 = c18968M24472.f61492;
        if (i2 == -1) {
            abstractViewOnClickListenerC8526.mo22839(abstractViewOnLongClickListenerC5544);
        } else {
            abstractViewOnClickListenerC8526.mo3565(abstractViewOnLongClickListenerC5544, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r8v9, types: [l.ܿۡܳ] */
    public C9271(Main main, C8887 c8887) {
        this.f30155 = main;
        this.f30154 = c8887;
        this.f30158 = new C0873(main, this);
        this.f30164 = new C24740(main, C21576.m49088(R.string.MT_Protector), C21576.m49088(R.string.MT_Protector), this, -1);
        this.f30163 = new C8287(main, this);
        this.f30157 = new C4052(main, this);
        this.f30159 = new C23994(main, this);
        this.f30165 = new C1750(main, this);
        C7606.m20790(main, new C23304(2, this));
        C19518.m45044(main, (C18222) new InterfaceC16438() { // from class: l.ܿۡܳ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                this.f59479.m24487();
            }
        });
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m24487() {
        C1069 c1069 = this.f30161;
        if (c1069 == null) {
            return;
        }
        c1069.m4007();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24476() {
        C8887 c8887 = this.f30154;
        if (c8887.m23776()) {
            return;
        }
        c8887.m23769();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24481(boolean z) {
        C8887 c8887 = this.f30154;
        if (c8887.m23776()) {
            c8887.m23774(z);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m24482() {
        return this.f30154.m23776();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24477(AbstractViewOnLongClickListenerC5544 abstractViewOnLongClickListenerC5544) {
        ImageView imageView = abstractViewOnLongClickListenerC5544.f19267;
        if (imageView == null) {
            return;
        }
        this.f30154.m23770(imageView, abstractViewOnLongClickListenerC5544.mo16457());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24480(C25227 c25227) {
        this.f30156 = c25227;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24484(AbstractViewOnLongClickListenerC5544 abstractViewOnLongClickListenerC5544) {
        Runnable runnable;
        Runnable runnable2;
        if (abstractViewOnLongClickListenerC5544.mo16457()) {
            boolean z = abstractViewOnLongClickListenerC5544 instanceof C19714;
            C7781 c7781 = this.f30162;
            if (z) {
                C25227 c25227 = this.f30156;
                if (c25227 != null && (runnable2 = this.f30160) != null) {
                    c25227.removeCallbacks(runnable2);
                }
                this.f30160 = null;
                c7781.m21166(abstractViewOnLongClickListenerC5544);
            } else {
                C25227 c25228 = this.f30156;
                if (c25228 != null && (runnable = this.f30160) != null) {
                    c25228.removeCallbacks(runnable);
                }
                this.f30160 = null;
                c7781.m21165();
            }
            this.f30154.m23771(abstractViewOnLongClickListenerC5544);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m24486(AbstractC11800 abstractC11800) {
        return this.f30162.m21169(abstractC11800);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24479(C19714 c19714) {
        this.f30162.m21167(c19714, c19714.itemView.getTop());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24485(C19714 c19714) {
        C7781 c7781;
        int iM21164;
        Runnable runnable;
        C25227 c25227 = this.f30156;
        if (c25227 == null || (iM21164 = (c7781 = this.f30162).m21164(c19714)) == -1) {
            return;
        }
        C25227 c25228 = this.f30156;
        if (c25228 != null && (runnable = this.f30160) != null) {
            c25228.removeCallbacks(runnable);
        }
        this.f30160 = null;
        RunnableC0323 runnableC0323 = new RunnableC0323(this, c19714, iM21164, c7781.m21170());
        this.f30160 = runnableC0323;
        c25227.postOnAnimation(runnableC0323);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24478(AbstractC11800 abstractC11800) {
        Runnable runnable;
        C7781 c7781 = this.f30162;
        if (c7781.m21171() != abstractC11800) {
            return;
        }
        C25227 c25227 = this.f30156;
        if (c25227 != null && (runnable = this.f30160) != null) {
            c25227.removeCallbacks(runnable);
        }
        this.f30160 = null;
        c7781.m21165();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24464(C9271 c9271, C19714 c19714, int i) {
        C25227 c25227 = c9271.f30156;
        if (c25227 != null && c9271.f30162.m21171() == c19714 && c19714.itemView.getParent() == c25227) {
            c25227.stopScroll();
            AbstractC3269 itemAnimator = c25227.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.mo10765();
            }
            int top = c19714.itemView.getTop() - i;
            if (top != 0) {
                c25227.scrollBy(0, top);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24474(AbstractViewOnClickListenerC8526 abstractViewOnClickListenerC8526) {
        return this.f30161.m4005(abstractViewOnClickListenerC8526);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13001 m24475(int i) {
        return this.f30161.m4006(i);
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f30161.m4008();
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Main main = this.f30155;
        switch (i) {
            case 0:
                return new C2560(main, C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false));
            case 1:
                return new C9821(main, C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false), this.f30158);
            case 2:
                return new C24190(main, C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false), this.f30157);
            case 3:
                return new C9032(main, C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false), this.f30163);
            case 4:
                return new C10698(main, C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false), this.f30165);
            case 5:
                return new C6094(main, C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false), this.f30159);
            case 6:
                return new C19714(main, C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false));
            default:
                throw new RuntimeException();
        }
    }

    @Override // l.AbstractC12964
    public final int getItemViewType(int i) {
        C18968 c18968M24472 = m24472(i);
        int i2 = c18968M24472.f61492;
        if (i2 == -1) {
            return 0;
        }
        return ((AbstractViewOnClickListenerC21206) c18968M24472.f61493.f27858.get(i2)).mo3322();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C18968 m24472(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C1069 c1069 = this.f30161;
            if (i2 >= c1069.size()) {
                throw new IllegalArgumentException(C13645.m33382(i, "Unknown drawer position "));
            }
            AbstractViewOnClickListenerC8526 abstractViewOnClickListenerC8526 = c1069.get(i2);
            int iMo13033 = abstractViewOnClickListenerC8526.mo13033();
            if (iMo13033 != 0) {
                int i4 = iMo13033 + i3;
                if (i < i4) {
                    return new C18968(abstractViewOnClickListenerC8526, i == i3 ? -1 : (i - i3) - 1);
                }
                i3 = i4;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23994 m24483() {
        return this.f30159;
    }
}
