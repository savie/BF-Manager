package l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.media.AudioManager;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.q;
import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩹۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes.dex */
public final class GestureDetectorOnGestureListenerC23544 implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f76052;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Formatter f76053;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f76054;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public long f76055;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AnimatorSet f76057;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f76058;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f76059;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f76060;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7135 f76061;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f76062;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f76063;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f76064;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f76065;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AudioManager f76066;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f76067;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final int f76068 = C6907.m19160(150.0f);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f76056 = -1;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetectorOnGestureListenerC23544(ActivityC7135 activityC7135) {
        this.f76061 = activityC7135;
        this.f76066 = (AudioManager) activityC7135.getSystemService("audio");
        StringBuilder sb = new StringBuilder();
        this.f76060 = sb;
        this.f76053 = new Formatter(sb, Locale.getDefault());
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ActivityC7135 activityC7135 = this.f76061;
        if (activityC7135.f23547.m15794()) {
            activityC7135.f23547.m15797();
            return true;
        }
        activityC7135.f23547.m15792();
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ActivityC7135 activityC7135 = this.f76061;
        if (ActivityC7135.m19648(activityC7135)) {
            onSingleTapConfirmed(motionEvent);
            return true;
        }
        activityC7135.m19705();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f76056 = -1;
        ActivityC7135 activityC7135 = this.f76061;
        this.f76063 = (activityC7135.f23519 || ActivityC7135.m19648(activityC7135)) ? false : true;
        ActivityC7135.m19622(activityC7135);
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52752() {
        if (this.f76065) {
            this.f76065 = false;
            ActivityC7135 activityC7135 = this.f76061;
            activityC7135.f23581.setVisibility(8);
            activityC7135.f23557.mo23551(new C7445(this.f76058));
            AnimatorSet animatorSet = this.f76057;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f76057 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52751(long j) {
        ActivityC7135 activityC7135 = this.f76061;
        if (activityC7135.f23579 == null || activityC7135.f23508 == null) {
            return;
        }
        StringBuilder sb = this.f76060;
        Formatter formatter = this.f76053;
        String strM19480 = C7116.m19480(sb, formatter, j);
        String strM19481 = C7116.m19480(sb, formatter, this.f76059);
        String strM19482 = C7116.m19480(sb, formatter, j - this.f76055);
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) strM19480).append('/').append((CharSequence) strM19481).append('\n');
        int length = spannableStringBuilderAppend.length();
        spannableStringBuilderAppend.append('[');
        if (strM19482.equals("-00:00") || strM19482.equals("00:00")) {
            spannableStringBuilderAppend.append((CharSequence) "00:00");
        } else {
            if (strM19482.charAt(0) != '-') {
                spannableStringBuilderAppend.append('+');
            }
            spannableStringBuilderAppend.append((CharSequence) strM19482);
        }
        spannableStringBuilderAppend.append(']');
        spannableStringBuilderAppend.setSpan(new ForegroundColorSpan(-5592406), 0, strM19480.length(), 17);
        spannableStringBuilderAppend.setSpan(new ForegroundColorSpan(-5592406), length, spannableStringBuilderAppend.length(), 17);
        activityC7135.f23579.setText(spannableStringBuilderAppend);
        ProgressBar progressBar = activityC7135.f23508;
        long j2 = this.f76059;
        progressBar.setProgress(j2 > 0 ? (int) ((j * 1000) / j2) : 0);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01fb A[PHI: r3
      0x01fb: PHI (r3v11 long) = (r3v9 long), (r3v10 long) binds: [B:80:0x01f9, B:83:0x0201] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f76063) {
            ActivityC7135 activityC7135 = this.f76061;
            if (!activityC7135.f23519) {
                int i = this.f76056;
                AudioManager audioManager = this.f76066;
                if (i == -1) {
                    if (motionEvent != null && (motionEvent.getY() > activityC7135.f23547.getHeight() * 0.9f || motionEvent.getY() < activityC7135.f23547.getHeight() * 0.1f)) {
                        this.f76056 = -2;
                    } else if (Math.abs(f) > Math.abs(f2)) {
                        if (activityC7135.f23542) {
                            this.f76056 = -2;
                            return false;
                        }
                        long duration = activityC7135.f23557.getDuration();
                        this.f76059 = duration;
                        if (duration == -9223372036854775807L) {
                            this.f76056 = -2;
                        } else {
                            activityC7135.f23495.setVisibility(8);
                            this.f76056 = 0;
                            long currentPosition = activityC7135.f23557.getCurrentPosition();
                            this.f76064 = currentPosition;
                            this.f76055 = currentPosition;
                            ActivityC7135.m19543(activityC7135);
                            m52751(this.f76064);
                            if (ActivityC7135.m19554(activityC7135, this.f76064, true, true) == null) {
                                activityC7135.m19653();
                            }
                        }
                    } else {
                        ActivityC7135.m19622(activityC7135);
                        activityC7135.f23495.setVisibility(0);
                        activityC7135.f23498.setVisibility(8);
                        activityC7135.f23525.setVisibility(0);
                        this.f76052 = motionEvent2.getY();
                        if (motionEvent2.getX() < activityC7135.f23547.getWidth() / 2.0f) {
                            this.f76056 = 1;
                            float f3 = activityC7135.getWindow().getAttributes().screenBrightness;
                            if (f3 == -1.0f) {
                                f3 = Settings.System.getInt(activityC7135.getContentResolver(), "screen_brightness", q.h) / 255.0f;
                            }
                            this.f76062 = f3;
                        } else {
                            this.f76056 = 2;
                            if (audioManager != null) {
                                this.f76067 = audioManager.getStreamVolume(3);
                                this.f76054 = audioManager.getStreamMaxVolume(3);
                            }
                        }
                    }
                }
                int i2 = this.f76056;
                if (i2 != 0) {
                    int i3 = this.f76068;
                    if (i2 == 1) {
                        float y = this.f76062 - ((motionEvent2.getY() - this.f76052) / i3);
                        if (y < 0.0f) {
                            y = 0.0f;
                        } else if (y > 1.0f) {
                            y = 1.0f;
                        }
                        WindowManager.LayoutParams attributes = activityC7135.getWindow().getAttributes();
                        if (attributes.screenBrightness != y) {
                            attributes.screenBrightness = y;
                            activityC7135.getWindow().setAttributes(attributes);
                        }
                        int i4 = (int) (y * 1000.0f);
                        if (i4 == 0) {
                            activityC7135.f23525.setImageResource(R.drawable.MT_Protector);
                        } else if (i4 < 333) {
                            activityC7135.f23525.setImageResource(R.drawable.MT_Protector);
                        } else if (i4 < 666) {
                            activityC7135.f23525.setImageResource(R.drawable.MT_Protector);
                        } else {
                            activityC7135.f23525.setImageResource(R.drawable.MT_Protector);
                        }
                        activityC7135.f23534.setProgress(i4);
                        return true;
                    }
                    if (i2 == 2) {
                        float y2 = motionEvent2.getY() - this.f76052;
                        int i5 = this.f76054;
                        int i6 = (int) (this.f76067 - ((y2 / i3) * i5));
                        if (i6 < 0) {
                            i6 = 0;
                        } else if (i6 > i5) {
                            i6 = i5;
                        }
                        int i7 = (i6 * 1000) / i5;
                        if (i7 == 0) {
                            activityC7135.f23525.setImageResource(R.drawable.MT_Protector);
                        } else if (i7 < 333) {
                            activityC7135.f23525.setImageResource(R.drawable.MT_Protector);
                        } else if (i7 < 666) {
                            activityC7135.f23525.setImageResource(R.drawable.MT_Protector);
                        } else {
                            activityC7135.f23525.setImageResource(R.drawable.MT_Protector);
                        }
                        if (audioManager != null) {
                            audioManager.setStreamVolume(3, i6, 0);
                        }
                        activityC7135.f23534.setProgress(i7);
                        return true;
                    }
                } else {
                    long jM19160 = this.f76064 - ((long) ((f / C6907.m19160(3.0f)) * 1000.0f));
                    long j = 0;
                    if (jM19160 < 0) {
                        jM19160 = j;
                    } else {
                        j = this.f76059;
                        if (jM19160 > j) {
                            jM19160 = j;
                        }
                    }
                    this.f76064 = jM19160;
                    m52751(jM19160);
                    if (ActivityC7135.m19554(activityC7135, jM19160, true, false) == null) {
                        activityC7135.m19653();
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ActivityC7135 activityC7135 = this.f76061;
        if (ActivityC7135.m19648(activityC7135) || activityC7135.f23542) {
            return;
        }
        if (activityC7135.f23557.isPlaying() || (activityC7135.f23557.mo23580() == 3 && activityC7135.f23557.mo23570())) {
            activityC7135.f23547.m15797();
            this.f76065 = true;
            activityC7135.f23581.setVisibility(0);
            float f = activityC7135.f23557.mo23563().f24500;
            this.f76058 = f;
            float fMax = Math.max(2.0f, f * 2.0f);
            ((TextView) activityC7135.f23581.getChildAt(3)).setText(new DecimalFormat("0.0##X").format(fMax));
            activityC7135.f23557.mo23551(new C7445(fMax));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(m52750(0), m52750(1), m52750(2));
            animatorSet.setDuration(800L);
            animatorSet.start();
            this.f76057 = animatorSet;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ObjectAnimator m52750(int i) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f76061.f23581.getChildAt(i), "alpha", 1.0f, 0.5f, 0.2f, 0.2f, 0.5f, 1.0f);
        final float f = 0.9f - (i * 0.1f);
        objectAnimatorOfFloat.setInterpolator(new TimeInterpolator() { // from class: l.ܶ۫֫
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f2) {
                float f3 = f2 + f;
                return f3 > 1.0f ? f3 - 1.0f : f3;
            }
        });
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setRepeatMode(1);
        return objectAnimatorOfFloat;
    }
}
