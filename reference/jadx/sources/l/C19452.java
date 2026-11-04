package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes5.dex */
public final class C19452 extends AbstractC12964 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8044 f62826;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f62827;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f62828;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f62829;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16468 f62830;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C11999 f62831;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f62832 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f62833;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f62834;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f62835;

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        C9622 c9622M21930;
        ViewOnClickListenerC11247 viewOnClickListenerC11247 = (ViewOnClickListenerC11247) abstractC11800;
        try {
            boolean zM44955 = m44955();
            C8044 c8044 = this.f62826;
            if (zM44955) {
                c9622M21930 = ((C21469) this.f62832.get(i)).f68579;
            } else {
                c9622M21930 = c8044.m21930(i);
            }
            viewOnClickListenerC11247.f35518 = c9622M21930;
            C20811.m47604(viewOnClickListenerC11247.f35512, c9622M21930);
            viewOnClickListenerC11247.f35514.setText(c9622M21930.m25122());
            C8877 c8877M25121 = c9622M21930.m25121();
            if (c8877M25121 == null) {
                viewOnClickListenerC11247.f35517.setText(c9622M21930.m25117());
            } else {
                AbstractC0148 abstractC0148M20792 = C7606.m20792(c8877M25121.m23755());
                if (abstractC0148M20792 == null) {
                    viewOnClickListenerC11247.f35517.setText("error " + c9622M21930.m25117());
                } else {
                    viewOnClickListenerC11247.f35517.setText(abstractC0148M20792.mo1332() + c9622M21930.m25117());
                }
            }
            viewOnClickListenerC11247.f35510.setColorFilter(this.f62830.f53391);
            viewOnClickListenerC11247.m28483();
            if (this.f62827) {
                if (c8044.m21931()) {
                    viewOnClickListenerC11247.f35516.setVisibility(8);
                } else {
                    viewOnClickListenerC11247.f35516.setVisibility(0);
                    if (SystemClock.uptimeMillis() - this.f62834 < 100) {
                        viewOnClickListenerC11247.f35516.setAlpha(0.0f);
                        ObjectAnimator.ofFloat(viewOnClickListenerC11247.f35516, "alpha", 0.0f, 1.0f).setDuration(200L).start();
                    }
                }
                viewOnClickListenerC11247.itemView.setBackgroundColor(c9622M21930.m25116() ? C3296.f10761 : 0);
                return;
            }
            if (!c8044.m21931() && SystemClock.uptimeMillis() - this.f62834 < 100) {
                viewOnClickListenerC11247.f35516.setVisibility(0);
                ObjectAnimator duration = ObjectAnimator.ofFloat(viewOnClickListenerC11247.f35516, "alpha", 1.0f, 0.0f).setDuration(200L);
                duration.addListener(new C22436(viewOnClickListenerC11247));
                duration.start();
            } else {
                viewOnClickListenerC11247.f35516.setVisibility(8);
            }
            if (viewOnClickListenerC11247.itemView.getBackground() instanceof ColorDrawable) {
                C17423.m40911(viewOnClickListenerC11247.itemView);
            }
        } catch (RuntimeException unused) {
        }
    }

    public C19452(C16468 c16468, C25227 c25227, C8044 c8044) {
        this.f62830 = c16468;
        this.f62826 = c8044;
        C11999 c11999 = new C11999(new C10501(this, c8044));
        this.f62831 = c11999;
        c11999.m30173(c25227);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44959() {
        m44949();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m44958() {
        m44949();
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m44955() {
        return !this.f62830.f53398.isEmpty();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m44949() {
        ArrayList arrayList = this.f62832;
        arrayList.clear();
        if (!m44955()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        while (true) {
            C8044 c8044 = this.f62826;
            if (i < c8044.m21922()) {
                C9622 c9622M21930 = c8044.m21930(i);
                String strM25122 = c9622M21930.m25122();
                C16468 c16468 = this.f62830;
                String str = c16468.f53398;
                int i2 = C24276.f78588;
                AbstractC21292 abstractC21292 = AbstractC21292.f67895;
                int iMo13267 = abstractC21292.mo13267(strM25122, str, 0);
                if (iMo13267 < 0) {
                    int iMo13268 = abstractC21292.mo13267(c9622M21930.m25117(), c16468.f53398, 0);
                    if (iMo13268 >= 0) {
                        arrayList3.add(new C21469(c9622M21930, i, iMo13268));
                    }
                } else {
                    arrayList2.add(new C21469(c9622M21930, i, iMo13267));
                }
                i++;
            } else {
                C12884.sort(arrayList2, C21469.f68578);
                C12884.sort(arrayList3, C21469.f68578);
                arrayList.addAll(arrayList2);
                arrayList.addAll(arrayList3);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m44940(C19452 c19452, C9622 c9622) {
        ArrayList arrayList = c19452.f62832;
        if (!c19452.m44955()) {
            return c19452.f62826.m21923(c9622);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C21469) arrayList.get(i)).f68579 == c9622) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44943(C19452 c19452, C9622 c9622, int i) {
        ArrayList arrayList = c19452.f62832;
        if (i == -1) {
            c19452.notifyDataSetChanged();
            return;
        }
        if (c19452.m44955() && i < arrayList.size() && ((C21469) arrayList.get(i)).f68579 == c9622) {
            arrayList.remove(i);
        }
        c19452.notifyItemRemoved(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m44953(final C19452 c19452, C9622 c9622) {
        C8044 c8044 = c19452.f62826;
        int iM21923 = c8044.m21923(c9622);
        if (iM21923 == -1) {
            c19452.m44958();
            return;
        }
        if (iM21923 == 0) {
            c8044.f26670.scrollToPosition(0);
        } else {
            if (!c8044.m21927(iM21923)) {
                c19452.m44958();
                return;
            }
            c19452.notifyItemMoved(iM21923, 0);
            c8044.f26670.post(new Runnable() { // from class: l.᩷֡ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69222.f62826.f26670.scrollToPosition(0);
                }
            });
            C4052.f13792.mo40348(Object.class);
        }
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C16468 c16468 = this.f62830;
        return new ViewOnClickListenerC11247(c16468, this, LayoutInflater.from(c16468.f53390).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        if (m44955()) {
            return this.f62832.size();
        }
        return this.f62826.m21922();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44957(int i) {
        if (this.f62827) {
            return;
        }
        C16468 c16468 = this.f62830;
        if (C16468.m39043(c16468)) {
            return;
        }
        c16468.m39050();
        this.f62827 = true;
        this.f62834 = SystemClock.uptimeMillis();
        this.f62835 = i;
        this.f62828 = -2;
        C8044 c8044 = this.f62826;
        c8044.m21928();
        if (i != -1) {
            c8044.m21930(i).m25115(true);
            this.f62829 = 1;
        } else {
            this.f62829 = 0;
        }
        notifyDataSetChanged();
        c16468.f53393.m36527(c8044.f26671);
        c16468.f53393.m34140(false);
        C24674 c24674 = new C24674(c16468.f53409, c16468.f53404, c16468.f53403);
        C24674 c24674M39042 = C16468.m39042(c16468);
        c24674.setAlpha(0.0f);
        c24674.m55018(0);
        c24674M39042.f79847 = true;
        ObjectAnimator.ofFloat(c24674, "alpha", 0.0f, 1.0f).setDuration(200L).start();
        ObjectAnimator.ofFloat(c24674M39042, "alpha", 1.0f, 0.0f).setDuration(200L).start();
        c16468.f53404.setOnClickListener(new View.OnClickListener() { // from class: l.ۢܿܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32825.m44956();
            }
        });
        c16468.f53411.setVisibility(c8044.m21931() ? 8 : 0);
        c16468.f53411.setOnClickListener(new View.OnClickListener() { // from class: l.֨ܿܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19452.m44945(this.f4770);
            }
        });
        c16468.f53400.setVisibility(c8044.m21931() ? 8 : 0);
        c16468.f53400.setOnClickListener(new View.OnClickListener() { // from class: l.ۡܿܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19452.m44954(this.f30873);
            }
        });
        c16468.f53401.setOnClickListener(new View.OnClickListener() { // from class: l.ۖܿܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19452.m44951(this.f9275);
            }
        });
        C16468.m39025(c16468, this.f62829 > 0);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44945(final C19452 c19452) {
        C8044 c8044 = c19452.f62826;
        final C5061 c5061M21919 = C8044.m21919(c8044);
        if (c19452.f62829 == 0) {
            return;
        }
        final DialogInterfaceOnClickListenerC19231 dialogInterfaceOnClickListenerC19231 = new DialogInterfaceOnClickListenerC19231(c8044.f26671);
        C2361 c2361BuildDialog = c19452.f62830.f53390.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8013(dialogInterfaceOnClickListenerC19231.f62189, dialogInterfaceOnClickListenerC19231.f62188, dialogInterfaceOnClickListenerC19231);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬ܿܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C19452 c19453 = this.f44374;
                c19453.getClass();
                DialogInterfaceOnClickListenerC19231 dialogInterfaceOnClickListenerC19232 = dialogInterfaceOnClickListenerC19231;
                int i2 = dialogInterfaceOnClickListenerC19232.f62190;
                int i3 = dialogInterfaceOnClickListenerC19232.f62188;
                if (i2 != i3) {
                    c5061M21919.m15313(C22961.m51812(dialogInterfaceOnClickListenerC19232.f62189[i3].m50239()));
                    c19453.m44956();
                }
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44954(final C19452 c19452) {
        C8044 c8044 = c19452.f62826;
        final C5061 c5061M21919 = C8044.m21919(c8044);
        if (c19452.f62829 == 0) {
            return;
        }
        final DialogInterfaceOnClickListenerC19231 dialogInterfaceOnClickListenerC19231 = new DialogInterfaceOnClickListenerC19231(c8044.f26671);
        C2361 c2361BuildDialog = c19452.f62830.f53390.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8013(dialogInterfaceOnClickListenerC19231.f62189, dialogInterfaceOnClickListenerC19231.f62188, dialogInterfaceOnClickListenerC19231);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۙ֡ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C19452 c19453 = this.f16130;
                c19453.getClass();
                DialogInterfaceOnClickListenerC19231 dialogInterfaceOnClickListenerC19232 = dialogInterfaceOnClickListenerC19231;
                int i2 = dialogInterfaceOnClickListenerC19232.f62190;
                int i3 = dialogInterfaceOnClickListenerC19232.f62188;
                if (i2 != i3) {
                    c5061M21919.m15322(C22961.m51812(dialogInterfaceOnClickListenerC19232.f62189[i3].m50239()));
                    c19453.m44956();
                }
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44951(final C19452 c19452) {
        C16468 c16468 = c19452.f62830;
        final C5061 c5061M21919 = C8044.m21919(c19452.f62826);
        int i = c19452.f62829;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            C9622 c9622M15319 = c5061M21919.m15319();
            int i2 = c5061M21919.m15314() ? R.string.MT_Protector : R.string.MT_Protector;
            String strM25122 = c9622M15319 == null ? "null" : c9622M15319.m25122();
            C2361 c2361BuildDialog = c16468.f53390.buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8008(C21576.m49059(i2, strM25122));
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۠ܿܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C19452 c19453 = this.f28643;
                    c19453.getClass();
                    c5061M21919.m15308();
                    c19453.m44956();
                }
            });
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8016();
            return;
        }
        int i3 = c5061M21919.m15314() ? R.string.MT_Protector : R.string.MT_Protector;
        C2361 c2361BuildDialog2 = c16468.f53390.buildDialog();
        c2361BuildDialog2.m8021(R.string.MT_Protector);
        c2361BuildDialog2.m8008(C21576.m49059(i3, Integer.valueOf(c19452.f62829)));
        c2361BuildDialog2.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜܿܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C19452 c19453 = this.f24022;
                c19453.getClass();
                c5061M21919.m15308();
                c19453.m44956();
            }
        });
        c2361BuildDialog2.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog2.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44956() {
        if (this.f62827) {
            this.f62827 = false;
            this.f62834 = SystemClock.uptimeMillis();
            notifyDataSetChanged();
            C16468 c16468 = this.f62830;
            c16468.f53393.m34140(true);
            C24674 c24674M39042 = C16468.m39042(c16468);
            C24674 c24674 = new C24674(c16468.f53409, c16468.f53404, c16468.f53403);
            c24674M39042.setAlpha(0.0f);
            c24674M39042.m55018(0);
            c24674.f79845 = true;
            ObjectAnimator.ofFloat(c24674M39042, "alpha", 0.0f, 1.0f).setDuration(200L).start();
            ObjectAnimator.ofFloat(c24674, "alpha", 1.0f, 0.0f).setDuration(200L).start();
            c16468.f53388.setVisibility(C16468.m39031(c16468));
            c16468.f53404.setOnClickListener(null);
            c16468.f53411.setOnClickListener(null);
            c16468.f53400.setOnClickListener(null);
            c16468.f53401.setOnClickListener(null);
        }
    }
}
