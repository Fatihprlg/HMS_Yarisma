using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.PlatformConfiguration;
using Xamarin.Forms.Xaml;

namespace HMS_Yarisma
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class Page1 : ContentPage
    {
        public Page1()
        {
            InitializeComponent();
        }

        public NoteClass NewNote = new NoteClass();

        private async void Save_Clicked(object sender, EventArgs e)
        {
            if (string.IsNullOrEmpty(noteHeader.Text) || string.IsNullOrEmpty(noteText.Text))
            {
                await DisplayAlert("Warning!", "Can not save empty note!", "Cancel");
            }
            else
            {
                try
                {
                    NewNote.Header = noteHeader.Text;
                    NewNote.Text = noteText.Text;
                    Notes.notes.Add(NewNote);
                    await Navigation.PopAsync();
                }
                catch (Exception ex)
                {
                    await DisplayAlert("Exeption!", ex.Message, "Ok");
                    throw;
                }
            }
        }

        private async void Cancel_Clicked(object sender, EventArgs e)
        {
            await Navigation.PopAsync();
        }
    }
}