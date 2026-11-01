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

/* JADX INFO: renamed from: l.᩺۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes.dex */
public final class C22876 extends AbstractC0414 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C4647 f74402;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f74403;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C2017 f74404;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f74405;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f74406;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8765 f74407;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f74408;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f74409;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f74410;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f74411 = new ArrayList();

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        C11897 c11897M6500;
        ViewOnClickListenerC8059 viewOnClickListenerC8059 = (ViewOnClickListenerC8059) abstractC12554;
        try {
            boolean zM50624 = m50624();
            C2017 c2017 = this.f74404;
            if (zM50624) {
                c11897M6500 = ((C11191) this.f74411.get(i)).f37897;
            } else {
                c11897M6500 = c2017.m6500(i);
            }
            viewOnClickListenerC8059.f28243 = c11897M6500;
            C16109.m38142(viewOnClickListenerC8059.f28239, c11897M6500);
            viewOnClickListenerC8059.f28237.setText(c11897M6500.m29681());
            C5546 c5546M29659 = c11897M6500.m29659();
            if (c5546M29659 == null) {
                viewOnClickListenerC8059.f28242.setText(c11897M6500.m29678());
            } else {
                AbstractC12068 abstractC12068M15770 = C5717.m15770(c5546M29659.m15296());
                if (abstractC12068M15770 == null) {
                    viewOnClickListenerC8059.f28242.setText("error " + c11897M6500.m29678());
                } else {
                    viewOnClickListenerC8059.f28242.setText(abstractC12068M15770.mo4704() + c11897M6500.m29678());
                }
            }
            viewOnClickListenerC8059.f28241.setColorFilter(this.f74407.f30144);
            viewOnClickListenerC8059.m21216();
            if (this.f74405) {
                if (c2017.m6491()) {
                    viewOnClickListenerC8059.f28236.setVisibility(8);
                } else {
                    viewOnClickListenerC8059.f28236.setVisibility(0);
                    if (SystemClock.uptimeMillis() - this.f74410 < 100) {
                        viewOnClickListenerC8059.f28236.setAlpha(0.0f);
                        ObjectAnimator.ofFloat(viewOnClickListenerC8059.f28236, "alpha", 0.0f, 1.0f).setDuration(200L).start();
                    }
                }
                viewOnClickListenerC8059.itemView.setBackgroundColor(c11897M6500.m29673() ? C20368.f65992 : 0);
                return;
            }
            if (!c2017.m6491() && SystemClock.uptimeMillis() - this.f74410 < 100) {
                viewOnClickListenerC8059.f28236.setVisibility(0);
                ObjectAnimator duration = ObjectAnimator.ofFloat(viewOnClickListenerC8059.f28236, "alpha", 1.0f, 0.0f).setDuration(200L);
                duration.addListener(new C6647(viewOnClickListenerC8059));
                duration.start();
            } else {
                viewOnClickListenerC8059.f28236.setVisibility(8);
            }
            if (viewOnClickListenerC8059.itemView.getBackground() instanceof ColorDrawable) {
                C0674.m3027(viewOnClickListenerC8059.itemView);
            }
        } catch (RuntimeException unused) {
        }
    }

    public C22876(C8765 c8765, C17492 c17492, C2017 c2017) {
        this.f74407 = c8765;
        this.f74404 = c2017;
        C4647 c4647 = new C4647(new C3824(this, c2017));
        this.f74402 = c4647;
        c4647.m12825(c17492);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50642() {
        m50630();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m50641() {
        m50630();
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean m50624() {
        return !this.f74407.f30147.isEmpty();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m50630() {
        ArrayList arrayList = this.f74411;
        arrayList.clear();
        if (!m50624()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        while (true) {
            C2017 c2017 = this.f74404;
            if (i < c2017.m6492()) {
                C11897 c11897M6500 = c2017.m6500(i);
                String strM29681 = c11897M6500.m29681();
                C8765 c8765 = this.f74407;
                int iM18453 = C6851.m18453(c8765.f30147, strM29681, 0);
                if (iM18453 >= 0) {
                    arrayList2.add(new C11191(c11897M6500, i, iM18453));
                } else {
                    int iM18454 = C6851.m18453(c8765.f30147, c11897M6500.m29678(), 0);
                    if (iM18454 >= 0) {
                        arrayList3.add(new C11191(c11897M6500, i, iM18454));
                    }
                }
                i++;
            } else {
                C23846.sort(arrayList2, C11191.f37896);
                C23846.sort(arrayList3, C11191.f37896);
                arrayList.addAll(arrayList2);
                arrayList.addAll(arrayList3);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50626(C22876 c22876, C11897 c11897) {
        ArrayList arrayList = c22876.f74411;
        if (!c22876.m50624()) {
            return c22876.f74404.m6493(c11897);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C11191) arrayList.get(i)).f37897 == c11897) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50629(C22876 c22876, C11897 c11897, int i) {
        ArrayList arrayList = c22876.f74411;
        if (i == -1) {
            c22876.notifyDataSetChanged();
            return;
        }
        if (c22876.m50624() && i < arrayList.size() && ((C11191) arrayList.get(i)).f37897 == c11897) {
            arrayList.remove(i);
        }
        c22876.notifyItemRemoved(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m50637(final C22876 c22876, C11897 c11897) {
        C2017 c2017 = c22876.f74404;
        int iM6493 = c2017.m6493(c11897);
        if (iM6493 == -1) {
            c22876.m50641();
            return;
        }
        if (iM6493 == 0) {
            c2017.f7530.scrollToPosition(0);
        } else {
            if (!c2017.m6498(iM6493)) {
                c22876.m50641();
                return;
            }
            c22876.notifyItemMoved(iM6493, 0);
            c2017.f7530.post(new Runnable() { // from class: l.۬۠᩹
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43349.f74404.f7530.scrollToPosition(0);
                }
            });
            C8432.f29283.mo23641(Object.class);
        }
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8765 c8765 = this.f74407;
        return new ViewOnClickListenerC8059(c8765, this, LayoutInflater.from(c8765.f30135).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        if (m50624()) {
            return this.f74411.size();
        }
        return this.f74404.m6492();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50640(int i) {
        if (this.f74405) {
            return;
        }
        C8765 c8765 = this.f74407;
        if (C8765.m22803(c8765)) {
            return;
        }
        c8765.m22772();
        this.f74405 = true;
        this.f74410 = SystemClock.uptimeMillis();
        this.f74403 = i;
        this.f74409 = -2;
        C2017 c2017 = this.f74404;
        c2017.m6496();
        if (i != -1) {
            c2017.m6500(i).m29672(true);
            this.f74408 = 1;
        } else {
            this.f74408 = 0;
        }
        notifyDataSetChanged();
        c8765.f30143.m44413(c2017.f7531);
        c8765.f30143.m32931(false);
        C19348 c19348 = new C19348(c8765.f30150, c8765.f30136, c8765.f30131);
        C19348 c19348M22770 = C8765.m22770(c8765);
        c19348.setAlpha(0.0f);
        c19348.m44354(0);
        c19348M22770.f62387 = true;
        ObjectAnimator.ofFloat(c19348, "alpha", 0.0f, 1.0f).setDuration(200L).start();
        ObjectAnimator.ofFloat(c19348M22770, "alpha", 1.0f, 0.0f).setDuration(200L).start();
        c8765.f30136.setOnClickListener(new View.OnClickListener() { // from class: l.ۗᩴ᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12640.m50639();
            }
        });
        c8765.f30156.setVisibility(c2017.m6491() ? 8 : 0);
        c8765.f30156.setOnClickListener(new View.OnClickListener() { // from class: l.ۙ۠᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C22876.m50633(this.f16118);
            }
        });
        c8765.f30149.setVisibility(c2017.m6491() ? 8 : 0);
        c8765.f30149.setOnClickListener(new View.OnClickListener() { // from class: l.ܰ۠᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C22876.m50623(this.f45193);
            }
        });
        c8765.f30146.setOnClickListener(new View.OnClickListener() { // from class: l.ۨ۠᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C22876.m50635(this.f38951);
            }
        });
        C8765.m22784(c8765, this.f74408 > 0);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50633(final C22876 c22876) {
        C2017 c2017 = c22876.f74404;
        final C13308 c13308M6487 = C2017.m6487(c2017);
        if (c22876.f74408 == 0) {
            return;
        }
        final DialogInterfaceOnClickListenerC9780 dialogInterfaceOnClickListenerC9780 = new DialogInterfaceOnClickListenerC9780(c2017.f7531);
        C8067 c8067BuildDialog = c22876.f74407.f30135.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21266(dialogInterfaceOnClickListenerC9780.f33481, dialogInterfaceOnClickListenerC9780.f33482, dialogInterfaceOnClickListenerC9780);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩹۠᩹
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C22876 c22877 = this.f72523;
                c22877.getClass();
                DialogInterfaceOnClickListenerC9780 dialogInterfaceOnClickListenerC9781 = dialogInterfaceOnClickListenerC9780;
                int i2 = dialogInterfaceOnClickListenerC9781.f33483;
                int i3 = dialogInterfaceOnClickListenerC9781.f33482;
                if (i2 != i3) {
                    c13308M6487.m32806(C23186.m51197(dialogInterfaceOnClickListenerC9781.f33481[i3].m11762()));
                    c22877.m50639();
                }
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50623(final C22876 c22876) {
        C2017 c2017 = c22876.f74404;
        final C13308 c13308M6487 = C2017.m6487(c2017);
        if (c22876.f74408 == 0) {
            return;
        }
        final DialogInterfaceOnClickListenerC9780 dialogInterfaceOnClickListenerC9780 = new DialogInterfaceOnClickListenerC9780(c2017.f7531);
        C8067 c8067BuildDialog = c22876.f74407.f30135.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21266(dialogInterfaceOnClickListenerC9780.f33481, dialogInterfaceOnClickListenerC9780.f33482, dialogInterfaceOnClickListenerC9780);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֨۠᩹
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C22876 c22877 = this.f4679;
                c22877.getClass();
                DialogInterfaceOnClickListenerC9780 dialogInterfaceOnClickListenerC9781 = dialogInterfaceOnClickListenerC9780;
                int i2 = dialogInterfaceOnClickListenerC9781.f33483;
                int i3 = dialogInterfaceOnClickListenerC9781.f33482;
                if (i2 != i3) {
                    c13308M6487.m32813(C23186.m51197(dialogInterfaceOnClickListenerC9781.f33481[i3].m11762()));
                    c22877.m50639();
                }
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50635(final C22876 c22876) {
        C8765 c8765 = c22876.f74407;
        final C13308 c13308M6487 = C2017.m6487(c22876.f74404);
        int i = c22876.f74408;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            C11897 c11897M32810 = c13308M6487.m32810();
            int i2 = c13308M6487.m32809() ? R.string.MT_Protector : R.string.MT_Protector;
            String strM29681 = c11897M32810 == null ? "null" : c11897M32810.m29681();
            C8067 c8067BuildDialog = c8765.f30135.buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21261(C16737.m39264(i2, strM29681));
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۖ۠᩹
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C22876 c22877 = this.f9689;
                    c22877.getClass();
                    c13308M6487.m32801();
                    c22877.m50639();
                }
            });
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21269();
            return;
        }
        int i3 = c13308M6487.m32809() ? R.string.MT_Protector : R.string.MT_Protector;
        C8067 c8067BuildDialog2 = c8765.f30135.buildDialog();
        c8067BuildDialog2.m21274(R.string.MT_Protector);
        c8067BuildDialog2.m21261(C16737.m39264(i3, Integer.valueOf(c22876.f74408)));
        c8067BuildDialog2.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۚ۠᩹
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C22876 c22877 = this.f18158;
                c22877.getClass();
                c13308M6487.m32801();
                c22877.m50639();
            }
        });
        c8067BuildDialog2.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog2.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50639() {
        if (this.f74405) {
            this.f74405 = false;
            this.f74410 = SystemClock.uptimeMillis();
            notifyDataSetChanged();
            C8765 c8765 = this.f74407;
            c8765.f30143.m32931(true);
            C19348 c19348M22770 = C8765.m22770(c8765);
            C19348 c19348 = new C19348(c8765.f30150, c8765.f30136, c8765.f30131);
            c19348M22770.setAlpha(0.0f);
            c19348M22770.m44354(0);
            c19348.f62385 = true;
            ObjectAnimator.ofFloat(c19348M22770, "alpha", 0.0f, 1.0f).setDuration(200L).start();
            ObjectAnimator.ofFloat(c19348, "alpha", 1.0f, 0.0f).setDuration(200L).start();
            c8765.f30139.setVisibility(C8765.m22796(c8765));
            c8765.f30136.setOnClickListener(null);
            c8765.f30156.setOnClickListener(null);
            c8765.f30149.setOnClickListener(null);
            c8765.f30146.setOnClickListener(null);
        }
    }
}
