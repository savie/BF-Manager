.class public final synthetic Ll/֡ۜ᩸;
.super Ljava/lang/Object;
.source "YAH9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/۟ۜ᩸;

.field public final synthetic ᩶:Ll/᩺ۜ᩸;


# direct methods
.method public synthetic constructor <init>(Ll/۟ۜ᩸;Ll/᩺ۜ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ۜ᩸;->ܰ:Ll/۟ۜ᩸;

    iput-object p2, p0, Ll/֡ۜ᩸;->᩶:Ll/᩺ۜ᩸;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 461
    iget-object v0, p0, Ll/֡ۜ᩸;->ܰ:Ll/۟ۜ᩸;

    iget-object v0, v0, Ll/۟ۜ᩸;->ۚ:Ll/ۧۤܺ;

    invoke-virtual {v0}, Ll/ۧۤܺ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/֡ۜ᩸;->᩶:Ll/᩺ۜ᩸;

    invoke-static {v0}, Ll/ᩳۜ᩸;->᩷(Ll/᩺ۜ᩸;)V

    :cond_0
    return-void
.end method
