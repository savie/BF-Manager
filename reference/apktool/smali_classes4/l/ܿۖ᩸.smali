.class public final synthetic Ll/ܿۖ᩸;
.super Ljava/lang/Object;
.source "X68P"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ֡:Ll/ܶ᩷ᩴ;

.field public final synthetic ܰ:Ll/᩺ۜ᩸;

.field public final synthetic ܿ:Ljava/lang/RuntimeException;

.field public final synthetic ᩶:Ll/ᩳ۬᩸;


# direct methods
.method public synthetic constructor <init>(Ll/᩺ۜ᩸;Ll/ᩳ۬᩸;Ljava/lang/RuntimeException;Ll/ܶ᩷ᩴ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿۖ᩸;->ܰ:Ll/᩺ۜ᩸;

    iput-object p2, p0, Ll/ܿۖ᩸;->᩶:Ll/ᩳ۬᩸;

    iput-object p3, p0, Ll/ܿۖ᩸;->ܿ:Ljava/lang/RuntimeException;

    iput-object p4, p0, Ll/ܿۖ᩸;->֡:Ll/ܶ᩷ᩴ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 0
    iget-object p1, p0, Ll/ܿۖ᩸;->ܿ:Ljava/lang/RuntimeException;

    iget-object p2, p0, Ll/ܿۖ᩸;->֡:Ll/ܶ᩷ᩴ;

    iget-object v0, p0, Ll/ܿۖ᩸;->ܰ:Ll/᩺ۜ᩸;

    iget-object v1, p0, Ll/ܿۖ᩸;->᩶:Ll/ᩳ۬᩸;

    invoke-static {v0, v1, p1, p2}, Ll/᩺ۜ᩸;->᩸(Ll/᩺ۜ᩸;Ll/ᩳ۬᩸;Ljava/lang/RuntimeException;Ll/ܶ᩷ᩴ;)V

    return-void
.end method
