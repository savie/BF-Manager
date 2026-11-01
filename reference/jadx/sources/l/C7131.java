package l;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1H1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7131 {
    /* JADX WARN: Code duplicated, block: B:68:0x00d9 A[Catch: RuntimeException -> 0x00df, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00df, blocks: (B:66:0x00d3, B:68:0x00d9), top: B:79:0x00d3 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8543 m19032(Context context, ComponentCallbacksC22654 componentCallbacksC22654, boolean z, boolean z2) {
        int exitAnim;
        Animator animatorLoadAnimator;
        int iM19031;
        int nextTransition = componentCallbacksC22654.getNextTransition();
        if (z2) {
            if (z) {
                exitAnim = componentCallbacksC22654.getPopEnterAnim();
            } else {
                exitAnim = componentCallbacksC22654.getPopExitAnim();
            }
        } else if (z) {
            exitAnim = componentCallbacksC22654.getEnterAnim();
        } else {
            exitAnim = componentCallbacksC22654.getExitAnim();
        }
        componentCallbacksC22654.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = componentCallbacksC22654.mContainer;
        if (viewGroup != null && viewGroup.getTag(R.id.MT_Protector) != null) {
            componentCallbacksC22654.mContainer.setTag(R.id.MT_Protector, null);
        }
        ViewGroup viewGroup2 = componentCallbacksC22654.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = componentCallbacksC22654.onCreateAnimation(nextTransition, z, exitAnim);
        if (animationOnCreateAnimation != null) {
            return new C8543(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = componentCallbacksC22654.onCreateAnimator(nextTransition, z, exitAnim);
        if (animatorOnCreateAnimator != null) {
            return new C8543(animatorOnCreateAnimator);
        }
        if (exitAnim == 0 && nextTransition != 0) {
            if (nextTransition == 4097) {
                exitAnim = z ? R.animator.MT_Protector : R.animator.MT_Protector;
            } else if (nextTransition != 8194) {
                if (nextTransition != 8197) {
                    if (nextTransition == 4099) {
                        exitAnim = z ? R.animator.MT_Protector : R.animator.MT_Protector;
                    } else if (nextTransition != 4100) {
                        exitAnim = -1;
                    } else if (z) {
                        iM19031 = m19031(context, android.R.attr.activityOpenEnterAnimation);
                    } else {
                        iM19031 = m19031(context, android.R.attr.activityOpenExitAnimation);
                    }
                } else if (z) {
                    iM19031 = m19031(context, android.R.attr.activityCloseEnterAnimation);
                } else {
                    iM19031 = m19031(context, android.R.attr.activityCloseExitAnimation);
                }
                exitAnim = iM19031;
            } else {
                exitAnim = z ? R.animator.MT_Protector : R.animator.MT_Protector;
            }
        }
        if (exitAnim != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(exitAnim));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, exitAnim);
                    if (animationLoadAnimation != null) {
                        return new C8543(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, exitAnim);
                        if (animatorLoadAnimator != null) {
                            return new C8543(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e2) {
                        if (zEquals) {
                            throw e2;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, exitAnim);
                        if (animationLoadAnimation2 != null) {
                            return new C8543(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, exitAnim);
                if (animatorLoadAnimator != null) {
                    return new C8543(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m19031(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
