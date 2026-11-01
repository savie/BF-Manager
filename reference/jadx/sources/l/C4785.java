package l;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۙܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AJG */
/* JADX INFO: loaded from: classes2.dex */
public final class C4785 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f16813 = new AtomicInteger();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Handler f16814 = new HandlerC3229(Looper.getMainLooper());

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final TextView f16816;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final View f16817;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final TextView f16818;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Button f16819;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final TextView f16820;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final View f16821;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final TextView f16823;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final TextView f16824;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f16826;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f16828;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final ProgressBar f16829;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TextView f16831;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final TextView f16832;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final View f16833;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TextView f16836;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Runnable f16838;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AtomicReference f16815 = new AtomicReference();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AtomicReference f16822 = new AtomicReference();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AtomicReference f16834 = new AtomicReference();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AtomicReference f16830 = new AtomicReference();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AtomicReference f16825 = new AtomicReference();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AtomicInteger f16835 = new AtomicInteger(-1);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final WeakReference f16827 = new WeakReference(this);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f16837 = f16813.incrementAndGet();

    public C4785(AbstractActivityC12483 abstractActivityC12483) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        viewM30995.setKeepScreenOn(true);
        this.f16823 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        this.f16818 = (TextView) viewM30995.findViewById(R.id.value1);
        this.f16820 = (TextView) viewM30995.findViewById(R.id.value2);
        this.f16824 = (TextView) viewM30995.findViewById(R.id.value3);
        this.f16831 = (TextView) viewM30995.findViewById(R.id.value4);
        this.f16832 = (TextView) viewM30995.findViewById(R.id.value5);
        this.f16836 = (TextView) viewM30995.findViewById(R.id.header4);
        this.f16817 = viewM30995.findViewById(R.id.MT_Protector);
        this.f16833 = viewM30995.findViewById(R.id.MT_Protector);
        this.f16829 = (ProgressBar) viewM30995.findViewById(R.id.MT_Protector);
        this.f16819 = (Button) viewM30995.findViewById(R.id.MT_Protector);
        this.f16816 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        this.f16821 = viewM30995.findViewById(R.id.MT_Protector);
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21265(false);
        this.f16826 = c8067BuildDialog.m21252();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13289(RunnableC10098 runnableC10098) {
        this.f16828 = false;
        this.f16838 = runnableC10098;
        this.f16826.m44368(new DialogInterfaceOnKeyListenerC9581(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13283() {
        if (this.f16828) {
            return;
        }
        this.f16828 = true;
        Runnable runnable = this.f16838;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m13282() {
        return this.f16828;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m13292(CharSequence charSequence) {
        boolean zM33728 = C13890.m33728();
        AtomicReference atomicReference = this.f16815;
        if (zM33728) {
            atomicReference.set(null);
            this.f16823.setText(C1777.m5821(charSequence));
        } else {
            atomicReference.set(charSequence);
            m13291();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13296(CharSequence charSequence) {
        boolean zM33728 = C13890.m33728();
        AtomicReference atomicReference = this.f16825;
        if (zM33728) {
            atomicReference.set(null);
            this.f16816.setText(C1777.m5821(charSequence));
        } else {
            atomicReference.set(charSequence);
            m13291();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13286(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        View view = this.f16817;
        if (zIsEmpty) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            this.f16820.setText(C1777.m5821(charSequence));
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m13298(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        View view = this.f16833;
        if (zIsEmpty) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            this.f16824.setText(C1777.m5821(charSequence));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13288(ViewOnClickListenerC8105 viewOnClickListenerC8105) {
        Button button = this.f16819;
        button.setVisibility(0);
        button.setText(R.string.MT_Protector);
        button.setOnClickListener(viewOnClickListenerC8105);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m13297() {
        this.f16826.m44362();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m13294(CharSequence charSequence) {
        boolean zM33728 = C13890.m33728();
        AtomicReference atomicReference = this.f16822;
        if (zM33728) {
            atomicReference.set(null);
            this.f16818.setText(C1777.m5821(charSequence));
        } else {
            atomicReference.set(charSequence);
            m13291();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13290(final boolean z) {
        if (C13890.m33728()) {
            this.f16836.setText(z ? R.string.MT_Protector : R.string.MT_Protector);
        } else {
            C16737.m39273(new Runnable() { // from class: l.֫۫ۚ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6979.f16836.setText(z ? R.string.MT_Protector : R.string.MT_Protector);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13279(C4785 c4785, boolean z) {
        View view = c4785.f16833;
        View view2 = c4785.f16817;
        View view3 = c4785.f16821;
        TextView textView = c4785.f16816;
        if (z) {
            textView.setVisibility(0);
            view3.setVisibility(8);
            view2.setVisibility(8);
            view.setVisibility(8);
            return;
        }
        textView.setVisibility(8);
        view3.setVisibility(0);
        view2.setVisibility(c4785.f16820.length() == 0 ? 8 : 0);
        view.setVisibility(c4785.f16824.length() == 0 ? 8 : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13287(C3761 c3761) {
        String str;
        if (c3761.m10990() == 1) {
            str = c3761.m10993() + "/" + c3761.m10998();
        } else {
            str = c3761.m10999() + " (" + c3761.m10993() + "/" + c3761.m10998() + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        m13281(str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m13281(CharSequence charSequence) {
        boolean zM33728 = C13890.m33728();
        AtomicReference atomicReference = this.f16830;
        if (zM33728) {
            atomicReference.set(null);
            this.f16831.setText(charSequence);
        } else {
            atomicReference.set(charSequence);
            m13291();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13285(long j) {
        String str = C1791.m5863(j) + "/s";
        boolean zM33728 = C13890.m33728();
        AtomicReference atomicReference = this.f16834;
        if (zM33728) {
            atomicReference.set(null);
            this.f16832.setText(str);
        } else {
            atomicReference.set(str);
            m13291();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13284(int i) {
        ProgressBar progressBar = this.f16829;
        if (progressBar.getProgress() != i) {
            boolean zM33728 = C13890.m33728();
            AtomicInteger atomicInteger = this.f16835;
            if (zM33728) {
                atomicInteger.set(-1);
                progressBar.setProgress(i);
            } else {
                atomicInteger.set(i);
                m13291();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13295() {
        f16814.removeMessages(this.f16837);
        if (C13890.m33728()) {
            boolean zM13275 = m13275();
            DialogInterfaceC19356 dialogInterfaceC19356 = this.f16826;
            if (zM13275) {
                C13638.requireNonNull(dialogInterfaceC19356);
                C16737.m39274(new RunnableC3787(3, dialogInterfaceC19356), 50L);
                return;
            } else {
                dialogInterfaceC19356.dismiss();
                return;
            }
        }
        C16737.m39273(new RunnableC11199(1, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13276(C4785 c4785) {
        DialogInterfaceC19356 dialogInterfaceC19356 = c4785.f16826;
        if (c4785.m13275()) {
            C13638.requireNonNull(dialogInterfaceC19356);
            C16737.m39274(new RunnableC3787(3, dialogInterfaceC19356), 50L);
        } else {
            dialogInterfaceC19356.dismiss();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 m13293() {
        return this.f16826;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m13291() {
        Handler handler = f16814;
        int i = this.f16837;
        if (handler.hasMessages(i)) {
            return;
        }
        handler.sendMessageDelayed(handler.obtainMessage(i, this.f16827), 15L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean m13275() {
        boolean z;
        CharSequence charSequence = (CharSequence) this.f16815.getAndSet(null);
        CharSequence charSequence2 = (CharSequence) this.f16822.getAndSet(null);
        CharSequence charSequence3 = (CharSequence) this.f16834.getAndSet(null);
        CharSequence charSequence4 = (CharSequence) this.f16830.getAndSet(null);
        CharSequence charSequence5 = (CharSequence) this.f16825.getAndSet(null);
        int andSet = this.f16835.getAndSet(-1);
        if (charSequence != null) {
            this.f16823.setText(C1777.m5821(charSequence));
            z = true;
        } else {
            z = false;
        }
        if (charSequence2 != null) {
            this.f16818.setText(C1777.m5821(charSequence2));
            z = true;
        }
        if (charSequence3 != null) {
            this.f16832.setText(charSequence3);
            z = true;
        }
        if (charSequence4 != null) {
            this.f16831.setText(charSequence4);
            z = true;
        }
        if (charSequence5 != null) {
            this.f16816.setText(C1777.m5821(charSequence5));
            z = true;
        }
        if (andSet == -1) {
            return z;
        }
        this.f16829.setProgress(andSet);
        return true;
    }
}
