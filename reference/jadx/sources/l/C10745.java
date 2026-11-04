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

/* JADX INFO: renamed from: l.ۤ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4HH */
/* JADX INFO: loaded from: classes3.dex */
public class C10745 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ProgressBar f34128;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Button f34129;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ProgressBar f34130;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f34131;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextView f34132;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Runnable f34133;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final TextView f34138;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile boolean f34139;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final TextView f34142;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f34127 = new AtomicInteger();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Handler f34126 = new HandlerC21934(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AtomicReference f34141 = new AtomicReference();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AtomicReference f34136 = new AtomicReference();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f34137 = new AtomicInteger(-1);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f34135 = new AtomicInteger(-1);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final WeakReference f34134 = new WeakReference(this);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f34140 = f34127.incrementAndGet();

    public C10745(AbstractActivityC17204 abstractActivityC17204) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        viewM40395.setKeepScreenOn(true);
        this.f34142 = (TextView) viewM40395.findViewById(R.id.title);
        TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        this.f34138 = textView;
        this.f34130 = (ProgressBar) viewM40395.findViewById(R.id.MT_Protector);
        this.f34128 = (ProgressBar) viewM40395.findViewById(R.id.MT_Protector);
        this.f34132 = (TextView) viewM40395.findViewById(R.id.textView);
        this.f34129 = (Button) viewM40395.findViewById(R.id.MT_Protector);
        if (this instanceof C10043) {
            textView.setVisibility(0);
        }
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8005(viewM40395);
        c2361.m8012(false);
        this.f34131 = c2361.m7999();
    }

    /* JADX INFO: renamed from: ۙ */
    public C10745 mo25916(Runnable runnable) {
        this.f34139 = false;
        this.f34133 = runnable;
        this.f34131.m22427(new DialogInterfaceOnKeyListenerC6843(this));
        return this;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m27396() {
        this.f34131.m22427((DialogInterface.OnKeyListener) null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27402() {
        if (this.f34139) {
            return;
        }
        this.f34139 = true;
        Runnable runnable = this.f34133;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m27399() {
        return this.f34139;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m27395() {
        return this.f34131.m22434();
    }

    /* JADX INFO: renamed from: ᩻ */
    public C10745 mo25931() {
        this.f34131.m22432();
        return this;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m27397(int i) {
        m27404(C21576.m49075(i));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m27404(CharSequence charSequence) {
        boolean zM50557 = C22415.m50557();
        AtomicReference atomicReference = this.f34141;
        if (zM50557) {
            atomicReference.set(null);
            this.f34142.setText(m27386(charSequence));
        } else {
            atomicReference.set(charSequence);
            m27389();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m27391(int i) {
        m27393(C21576.m49075(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m27393(CharSequence charSequence) {
        boolean zM50557 = C22415.m50557();
        AtomicReference atomicReference = this.f34136;
        if (!zM50557) {
            if (charSequence == null) {
                charSequence = "";
            }
            atomicReference.set(charSequence);
            m27389();
            return;
        }
        atomicReference.set(null);
        CharSequence charSequenceM27386 = m27386(charSequence);
        TextView textView = this.f34138;
        textView.setText(charSequenceM27386);
        int i = ((this instanceof C10043) || !TextUtils.isEmpty(charSequence)) ? 0 : 8;
        if (textView.getVisibility() != i) {
            textView.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m27392(long j, long j2) {
        if (j2 == 0) {
            m27403(0);
        } else {
            m27403((int) ((j * 100) / j2));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m27403(int i) {
        ProgressBar progressBar = this.f34130;
        if (progressBar.getProgress() != i) {
            boolean zM50557 = C22415.m50557();
            AtomicInteger atomicInteger = this.f34137;
            if (zM50557) {
                atomicInteger.set(-1);
                progressBar.setProgress(i);
            } else {
                atomicInteger.set(i);
                m27389();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public C10745 mo25915(View.OnClickListener onClickListener) {
        Button button = this.f34129;
        button.setVisibility(0);
        button.setText(R.string.MT_Protector);
        button.setOnClickListener(onClickListener);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m27394(final boolean z) {
        if (C22415.m50557()) {
            this.f34130.setIndeterminate(z);
        } else {
            C21576.m49068(new Runnable() { // from class: l.۠ۖᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27321.f34130.setIndeterminate(z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m27405() {
        f34126.removeMessages(this.f34140);
        if (C22415.m50557()) {
            boolean zM27387 = m27387();
            DialogInterfaceC8327 dialogInterfaceC8327 = this.f34131;
            if (zM27387) {
                C17359.requireNonNull(dialogInterfaceC8327);
                C21576.m49069(new RunnableC22205(1, dialogInterfaceC8327), 50L);
                return;
            } else {
                dialogInterfaceC8327.dismiss();
                return;
            }
        }
        C21576.m49068(new RunnableC23484(2, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27385(C10745 c10745) {
        DialogInterfaceC8327 dialogInterfaceC8327 = c10745.f34131;
        if (c10745.m27387()) {
            C17359.requireNonNull(dialogInterfaceC8327);
            C21576.m49069(new RunnableC22205(1, dialogInterfaceC8327), 50L);
        } else {
            dialogInterfaceC8327.dismiss();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TextView m27400() {
        return this.f34138;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 m27401() {
        return this.f34131;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC25004 m27398() {
        return new C13554(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8161 m27390() {
        return new C4780(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27389() {
        Handler handler = f34126;
        int i = this.f34140;
        if (handler.hasMessages(i)) {
            return;
        }
        handler.sendMessageDelayed(handler.obtainMessage(i, this.f34134), 15L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean m27387() {
        boolean z;
        CharSequence charSequence = (CharSequence) this.f34141.getAndSet(null);
        CharSequence charSequence2 = (CharSequence) this.f34136.getAndSet(null);
        int andSet = this.f34137.getAndSet(-1);
        int andSet2 = this.f34135.getAndSet(-1);
        int i = 0;
        if (charSequence != null) {
            this.f34142.setText(m27386(charSequence));
            z = true;
        } else {
            z = false;
        }
        if (charSequence2 != null) {
            CharSequence charSequenceM27386 = m27386(charSequence2);
            TextView textView = this.f34138;
            textView.setText(charSequenceM27386);
            if (!(this instanceof C10043) && TextUtils.isEmpty(charSequence2)) {
                i = 8;
            }
            if (textView.getVisibility() != i) {
                textView.setVisibility(i);
            }
            z = true;
        }
        if (andSet != -1) {
            this.f34130.setProgress(andSet);
            z = true;
        }
        if (andSet2 == -1) {
            return z;
        }
        this.f34128.setProgress(andSet2);
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static CharSequence m27386(CharSequence charSequence) {
        return (charSequence == null || charSequence.length() <= 500) ? charSequence : charSequence.subSequence(0, 500);
    }
}
