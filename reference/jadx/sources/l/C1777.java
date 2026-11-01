package l;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֫ۧۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4HH */
/* JADX INFO: loaded from: classes2.dex */
public class C1777 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Runnable f6916;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ProgressBar f6918;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Button f6919;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final TextView f6920;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final TextView f6921;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f6922;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ProgressBar f6923;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f6924;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final TextView f6930;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f6915 = new AtomicInteger();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final Handler f6914 = new HandlerC14479(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AtomicReference f6927 = new AtomicReference();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public AtomicReference f6925 = new AtomicReference();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AtomicInteger f6928 = new AtomicInteger(-1);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f6926 = new AtomicInteger(-1);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final WeakReference f6929 = new WeakReference(this);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f6917 = f6915.incrementAndGet();

    public C1777(AbstractActivityC12483 abstractActivityC12483) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        viewM30995.setKeepScreenOn(true);
        this.f6930 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        this.f6920 = textView;
        this.f6923 = (ProgressBar) viewM30995.findViewById(R.id.MT_Protector);
        this.f6918 = (ProgressBar) viewM30995.findViewById(R.id.MT_Protector);
        this.f6921 = (TextView) viewM30995.findViewById(R.id.textView);
        this.f6919 = (Button) viewM30995.findViewById(R.id.MT_Protector);
        if (this instanceof C20164) {
            textView.setVisibility(0);
        }
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21258(viewM30995);
        c8067.m21265(false);
        this.f6922 = c8067.m21252();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1777 mo5828(Runnable runnable) {
        this.f6924 = false;
        this.f6916 = runnable;
        this.f6922.m44368(new DialogInterfaceOnKeyListenerC6011(this));
        return this;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m5836() {
        this.f6922.m44368((DialogInterface.OnKeyListener) null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m5839() {
        if (this.f6924) {
            return;
        }
        this.f6924 = true;
        Runnable runnable = this.f6916;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m5824() {
        return this.f6924;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m5838() {
        return this.f6922.m44375();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C1777 mo5843() {
        this.f6922.m44362();
        return this;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m5837(int i) {
        m5841(C16737.m39283(i));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m5841(CharSequence charSequence) {
        boolean zM33728 = C13890.m33728();
        AtomicReference atomicReference = this.f6927;
        if (zM33728) {
            atomicReference.set(null);
            this.f6930.setText(m5821(charSequence));
        } else {
            atomicReference.set(charSequence);
            m5826();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m5830(int i) {
        m5832(C16737.m39283(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m5832(CharSequence charSequence) {
        boolean zM33728 = C13890.m33728();
        AtomicReference atomicReference = this.f6925;
        if (!zM33728) {
            if (charSequence == null) {
                charSequence = "";
            }
            atomicReference.set(charSequence);
            m5826();
            return;
        }
        atomicReference.set(null);
        CharSequence charSequenceM5821 = m5821(charSequence);
        TextView textView = this.f6920;
        textView.setText(charSequenceM5821);
        int i = ((this instanceof C20164) || !TextUtils.isEmpty(charSequence)) ? 0 : 8;
        if (textView.getVisibility() != i) {
            textView.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m5831(long j, long j2) {
        if (j2 == 0) {
            m5840(0);
        } else {
            m5840((int) ((j * 100) / j2));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m5840(int i) {
        ProgressBar progressBar = this.f6923;
        if (progressBar.getProgress() != i) {
            boolean zM33728 = C13890.m33728();
            AtomicInteger atomicInteger = this.f6928;
            if (zM33728) {
                atomicInteger.set(-1);
                progressBar.setProgress(i);
            } else {
                atomicInteger.set(i);
                m5826();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1777 mo5827(View.OnClickListener onClickListener) {
        Button button = this.f6919;
        button.setVisibility(0);
        button.setText(R.string.MT_Protector);
        button.setOnClickListener(onClickListener);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m5833(final boolean z) {
        if (C13890.m33728()) {
            this.f6923.setIndeterminate(z);
        } else {
            C16737.m39273(new Runnable() { // from class: l.ܿۧۚ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55074.f6923.setIndeterminate(z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m5825() {
        f6914.removeMessages(this.f6917);
        if (C13890.m33728()) {
            boolean zM5823 = m5823();
            DialogInterfaceC19356 dialogInterfaceC19356 = this.f6922;
            if (zM5823) {
                C13638.requireNonNull(dialogInterfaceC19356);
                C16737.m39274(new RunnableC3787(3, dialogInterfaceC19356), 50L);
                return;
            } else {
                dialogInterfaceC19356.dismiss();
                return;
            }
        }
        C16737.m39273(new RunnableC19991(1, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m5820(C1777 c1777) {
        DialogInterfaceC19356 dialogInterfaceC19356 = c1777.f6922;
        if (c1777.m5823()) {
            C13638.requireNonNull(dialogInterfaceC19356);
            C16737.m39274(new RunnableC3787(3, dialogInterfaceC19356), 50L);
        } else {
            dialogInterfaceC19356.dismiss();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TextView m5842() {
        return this.f6920;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 m5834() {
        return this.f6922;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23333 m5835() {
        return new C10951(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17379 m5829() {
        return new C23651(this);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m5826() {
        Handler handler = f6914;
        int i = this.f6917;
        if (handler.hasMessages(i)) {
            return;
        }
        handler.sendMessageDelayed(handler.obtainMessage(i, this.f6929), 15L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean m5823() {
        boolean z;
        CharSequence charSequence = (CharSequence) this.f6927.getAndSet(null);
        CharSequence charSequence2 = (CharSequence) this.f6925.getAndSet(null);
        int andSet = this.f6928.getAndSet(-1);
        int andSet2 = this.f6926.getAndSet(-1);
        int i = 0;
        if (charSequence != null) {
            this.f6930.setText(m5821(charSequence));
            z = true;
        } else {
            z = false;
        }
        if (charSequence2 != null) {
            CharSequence charSequenceM5821 = m5821(charSequence2);
            TextView textView = this.f6920;
            textView.setText(charSequenceM5821);
            if (!(this instanceof C20164) && TextUtils.isEmpty(charSequence2)) {
                i = 8;
            }
            if (textView.getVisibility() != i) {
                textView.setVisibility(i);
            }
            z = true;
        }
        if (andSet != -1) {
            this.f6923.setProgress(andSet);
            z = true;
        }
        if (andSet2 == -1) {
            return z;
        }
        this.f6918.setProgress(andSet2);
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static CharSequence m5821(CharSequence charSequence) {
        return (charSequence == null || charSequence.length() <= 500) ? charSequence : charSequence.subSequence(0, 500);
    }
}
