.class public final Ll/۠ۗ᩸;
.super Ljava/lang/Object;
.source "06KD"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ܰ:Ljava/lang/String;

.field public final synthetic ᩶:Ll/ۜۗ᩸;


# direct methods
.method public constructor <init>(Ll/ۜۗ᩸;)V
    .locals 1

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۗ᩸;->᩶:Ll/ۜۗ᩸;

    .line 60
    invoke-virtual {p1}, Ll/ۜۗ᩸;->ۙ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/۠ۗ᩸;->ܰ:Ljava/lang/String;

    const-string v0, "writing_source_checkpoint"

    .line 61
    invoke-virtual {p1, v0}, Ll/ۜۗ᩸;->ۙ(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 62
    iget-object v0, p0, Ll/۠ۗ᩸;->᩶:Ll/ۜۗ᩸;

    iget-object v1, p0, Ll/۠ۗ᩸;->ܰ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۜۗ᩸;->ۙ(Ljava/lang/String;)V

    return-void
.end method
