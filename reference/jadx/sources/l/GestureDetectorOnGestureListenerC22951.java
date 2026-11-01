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

/* JADX INFO: renamed from: l.᩺ۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes.dex */
public final class GestureDetectorOnGestureListenerC22951 implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f74606;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f74607;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f74609;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public long f74610;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f74611;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Formatter f74613;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10957 f74614;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AnimatorSet f74615;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f74616;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f74617;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f74618;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f74619;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f74620;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AudioManager f74621;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f74622;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final int f74608 = C13932.m33769(150.0f);

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f74612 = -1;

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

    public GestureDetectorOnGestureListenerC22951(ActivityC10957 activityC10957) {
        this.f74614 = activityC10957;
        this.f74621 = (AudioManager) activityC10957.getSystemService("audio");
        StringBuilder sb = new StringBuilder();
        this.f74611 = sb;
        this.f74613 = new Formatter(sb, Locale.getDefault());
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ActivityC10957 activityC10957 = this.f74614;
        if (activityC10957.f37275.m43055()) {
            activityC10957.f37275.m43050();
            return true;
        }
        activityC10957.f37275.m43049();
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ActivityC10957 activityC10957 = this.f74614;
        if (ActivityC10957.m27694(activityC10957)) {
            onSingleTapConfirmed(motionEvent);
            return true;
        }
        activityC10957.m27711();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f74612 = -1;
        ActivityC10957 activityC10957 = this.f74614;
        this.f74618 = (activityC10957.f37318 || ActivityC10957.m27694(activityC10957)) ? false : true;
        ActivityC10957.m27617(activityC10957);
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50796() {
        if (this.f74620) {
            this.f74620 = false;
            ActivityC10957 activityC10957 = this.f74614;
            activityC10957.f37360.setVisibility(8);
            activityC10957.f37367.mo25819(new C21449(this.f74607));
            AnimatorSet animatorSet = this.f74615;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f74615 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50795(long j) {
        ActivityC10957 activityC10957 = this.f74614;
        if (activityC10957.f37355 == null || activityC10957.f37307 == null) {
            return;
        }
        StringBuilder sb = this.f74611;
        Formatter formatter = this.f74613;
        String strM41833 = C17983.m41833(sb, formatter, j);
        String strM41834 = C17983.m41833(sb, formatter, this.f74622);
        String strM41835 = C17983.m41833(sb, formatter, j - this.f74610);
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) strM41833).append('/').append((CharSequence) strM41834).append('\n');
        int length = spannableStringBuilderAppend.length();
        spannableStringBuilderAppend.append('[');
        if (strM41835.equals("-00:00") || strM41835.equals("00:00")) {
            spannableStringBuilderAppend.append((CharSequence) "00:00");
        } else {
            if (strM41835.charAt(0) != '-') {
                spannableStringBuilderAppend.append('+');
            }
            spannableStringBuilderAppend.append((CharSequence) strM41835);
        }
        spannableStringBuilderAppend.append(']');
        spannableStringBuilderAppend.setSpan(new ForegroundColorSpan(-5592406), 0, strM41833.length(), 17);
        spannableStringBuilderAppend.setSpan(new ForegroundColorSpan(-5592406), length, spannableStringBuilderAppend.length(), 17);
        activityC10957.f37355.setText(spannableStringBuilderAppend);
        ProgressBar progressBar = activityC10957.f37307;
        long j2 = this.f74622;
        progressBar.setProgress(j2 > 0 ? (int) ((j * 1000) / j2) : 0);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01fb A[PHI: r3
      0x01fb: PHI (r3v11 long) = (r3v9 long), (r3v10 long) binds: [B:80:0x01f9, B:83:0x0201] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f74618) {
            ActivityC10957 activityC10957 = this.f74614;
            if (!activityC10957.f37318) {
                int i = this.f74612;
                AudioManager audioManager = this.f74621;
                if (i == -1) {
                    if (motionEvent != null && (motionEvent.getY() > activityC10957.f37275.getHeight() * 0.9f || motionEvent.getY() < activityC10957.f37275.getHeight() * 0.1f)) {
                        this.f74612 = -2;
                    } else if (Math.abs(f) > Math.abs(f2)) {
                        if (activityC10957.f37311) {
                            this.f74612 = -2;
                            return false;
                        }
                        long duration = activityC10957.f37367.getDuration();
                        this.f74622 = duration;
                        if (duration == -9223372036854775807L) {
                            this.f74612 = -2;
                        } else {
                            activityC10957.f37345.setVisibility(8);
                            this.f74612 = 0;
                            long currentPosition = activityC10957.f37367.getCurrentPosition();
                            this.f74606 = currentPosition;
                            this.f74610 = currentPosition;
                            ActivityC10957.m27691(activityC10957);
                            m50795(this.f74606);
                            if (ActivityC10957.m27564(activityC10957, this.f74606, true, true) == null) {
                                activityC10957.m27671();
                            }
                        }
                    } else {
                        ActivityC10957.m27617(activityC10957);
                        activityC10957.f37345.setVisibility(0);
                        activityC10957.f37321.setVisibility(8);
                        activityC10957.f37327.setVisibility(0);
                        this.f74619 = motionEvent2.getY();
                        if (motionEvent2.getX() < activityC10957.f37275.getWidth() / 2.0f) {
                            this.f74612 = 1;
                            float f3 = activityC10957.getWindow().getAttributes().screenBrightness;
                            if (f3 == -1.0f) {
                                f3 = Settings.System.getInt(activityC10957.getContentResolver(), "screen_brightness", q.h) / 255.0f;
                            }
                            this.f74609 = f3;
                        } else {
                            this.f74612 = 2;
                            if (audioManager != null) {
                                this.f74616 = audioManager.getStreamVolume(3);
                                this.f74617 = audioManager.getStreamMaxVolume(3);
                            }
                        }
                    }
                }
                int i2 = this.f74612;
                if (i2 != 0) {
                    int i3 = this.f74608;
                    if (i2 == 1) {
                        float y = this.f74609 - ((motionEvent2.getY() - this.f74619) / i3);
                        if (y < 0.0f) {
                            y = 0.0f;
                        } else if (y > 1.0f) {
                            y = 1.0f;
                        }
                        WindowManager.LayoutParams attributes = activityC10957.getWindow().getAttributes();
                        if (attributes.screenBrightness != y) {
                            attributes.screenBrightness = y;
                            activityC10957.getWindow().setAttributes(attributes);
                        }
                        int i4 = (int) (y * 1000.0f);
                        if (i4 == 0) {
                            activityC10957.f37327.setImageResource(R.drawable.MT_Protector);
                        } else if (i4 < 333) {
                            activityC10957.f37327.setImageResource(R.drawable.MT_Protector);
                        } else if (i4 < 666) {
                            activityC10957.f37327.setImageResource(R.drawable.MT_Protector);
                        } else {
                            activityC10957.f37327.setImageResource(R.drawable.MT_Protector);
                        }
                        activityC10957.f37300.setProgress(i4);
                        return true;
                    }
                    if (i2 == 2) {
                        float y2 = motionEvent2.getY() - this.f74619;
                        int i5 = this.f74617;
                        int i6 = (int) (this.f74616 - ((y2 / i3) * i5));
                        if (i6 < 0) {
                            i6 = 0;
                        } else if (i6 > i5) {
                            i6 = i5;
                        }
                        int i7 = (i6 * 1000) / i5;
                        if (i7 == 0) {
                            activityC10957.f37327.setImageResource(R.drawable.MT_Protector);
                        } else if (i7 < 333) {
                            activityC10957.f37327.setImageResource(R.drawable.MT_Protector);
                        } else if (i7 < 666) {
                            activityC10957.f37327.setImageResource(R.drawable.MT_Protector);
                        } else {
                            activityC10957.f37327.setImageResource(R.drawable.MT_Protector);
                        }
                        if (audioManager != null) {
                            audioManager.setStreamVolume(3, i6, 0);
                        }
                        activityC10957.f37300.setProgress(i7);
                        return true;
                    }
                } else {
                    long jM33769 = this.f74606 - ((long) ((f / C13932.m33769(3.0f)) * 1000.0f));
                    long j = 0;
                    if (jM33769 < 0) {
                        jM33769 = j;
                    } else {
                        j = this.f74622;
                        if (jM33769 > j) {
                            jM33769 = j;
                        }
                    }
                    this.f74606 = jM33769;
                    m50795(jM33769);
                    if (ActivityC10957.m27564(activityC10957, jM33769, true, false) == null) {
                        activityC10957.m27671();
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ActivityC10957 activityC10957 = this.f74614;
        if (ActivityC10957.m27694(activityC10957) || activityC10957.f37311) {
            return;
        }
        if (activityC10957.f37367.isPlaying() || (activityC10957.f37367.mo25808() == 3 && activityC10957.f37367.mo25806())) {
            activityC10957.f37275.m43050();
            this.f74620 = true;
            activityC10957.f37360.setVisibility(0);
            float f = activityC10957.f37367.mo25832().f69728;
            this.f74607 = f;
            float fMax = Math.max(2.0f, f * 2.0f);
            ((TextView) activityC10957.f37360.getChildAt(3)).setText(new DecimalFormat("0.0##X").format(fMax));
            activityC10957.f37367.mo25819(new C21449(fMax));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(m50794(0), m50794(1), m50794(2));
            animatorSet.setDuration(800L);
            animatorSet.start();
            this.f74615 = animatorSet;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ObjectAnimator m50794(int i) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f74614.f37360.getChildAt(i), "alpha", 1.0f, 0.5f, 0.2f, 0.2f, 0.5f, 1.0f);
        final float f = 0.9f - (i * 0.1f);
        objectAnimatorOfFloat.setInterpolator(new TimeInterpolator() { // from class: l.ۜۧ۬
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
