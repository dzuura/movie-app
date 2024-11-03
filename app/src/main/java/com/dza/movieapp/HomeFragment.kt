package com.dza.movieapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dza.movieapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = binding.rvMovie

        // Daftar film
        val movieList = listOf(
            Movie(R.drawable.movie_1, "Venom : The Last Dance", "1h 30m","R13+", "Journalist Eddie Brock is trying to take down Carlton Drake, the notorious and brilliant founder of the Life Foundation. While investigating one of Drake\\'s experiments, Eddie\\'s body merges with the alien Venom -- leaving him with superhuman strength and power. Twisted, dark and fueled by rage, Venom tries to control the new and dangerous abilities that Eddie finds so intoxicating."),
            Movie(R.drawable.movie_2, "DOSA MUSYRIK", "1h 32m", "D17+", "Kisah utama film ini adalah tentang Nugie, yang diperankan oleh Marthino Lio. Nugie memiliki seorang ibu dengan kondisi sakit parah. Pengobatan ibunya tidak tuntas karena sulitnya ekonomi.\n" + "\n" + "Nugie terpaksa berutang sehingga terlilit oleh bunga piutangnya. Ia menjadi gelap mata dan putus asa. Nugie lalu memutuskan meminta bantuan dukun, Mbah Narto.\n" + "\n" + "Mbah Narto kemudian memberi sebuah keris kepada Nugie. Ketika sudah membawa keris itu ke rumah, keluarga Nugie mulai mendapat teror gaib.\n" + "\n" + "Keris itu memiliki penunggu bernama Ni Larapati. Sosok gaib itu mulai meminta nyawa keluarga Nugie satu per satu. Nugie menderita karena syirik dan berharap kepada dukun untuk menyelesaikan masalahnya.\n" + "\n" + "Nugie berharap mendapat harta, kesembuhan dan pertolongan dari keris yang diberikan dukun. Faktanya, Ni Larapati malah meminta tumbal nyawa keluarga Nugie."),
            Movie(R.drawable.movie_3, "Inside Out 2", "1h 45m", "7+", "Pada sekuel film ini menceritakan tentang Riley yang beranjak remaja dan memasuki masa pubertas mengalami ketidakstabilan emosi yang membuat munculnya emosi-emosi baru yang mengambil kendali isi pikirannya yang sebelumnya hanya dipegang oleh emosi Joy, Sadness, Anger, Fear, dan Disgust.\n" + "\n" + "Emosi-emosi tersebut merupakan Anxiety, Envy, Embarrassment, dan Ennui.\n" + "\n" + "Para emosi baru ini muncul karena perubahan rencana mendadak dimana kedua sahabatnya mengaku bahwa mereka akan pindah sekolah dan meninggalkan Riley di sekolah barunya sendirian. Hal ini membuat Riley sedih dan gelisah akan masa depan dimana ia tidak bersama dengan sahabat-sahabatnya."),
            Movie(R.drawable.movie_4, "Transformer One", "1h 45m", "R13+", "Berlatar di planet Cybertron, film Transformers One akan menyajikan kisah persahabatan antara Optimus Prime dan Megatron. Namun, konflik yang dihadapi mengubah hubungan keduanya dari saudara seperjuangan menjadi musuh bebuyutan.Selain itu, Transformers One juga akan mengeksplor kisah awal perseteruan kelompok Autobots dan Decepticons. Yang hingga kini kedua kelompok yang masing-masing dipimpin oleh Prime dan Megatron, dikenal sebagai pertempuran kelompok mecha yang tak berujung.\n"),
            Movie(R.drawable.movie_5, "Haikyu!! The Dumpster \nBattle", "1h 25m","R13+", "Kenma Kozume has never considered volleyball fun or thrilling: it is merely something he is good at. But now Nekoma High School's volleyball team has qualified for the Spring Nationals and prepares to battle their long-standing rivals—Karasuno. Now, Kenma has to analyze the most confounding and resilient team and lead Nekoma to victory against them. Moreover, he will play against his friend Shouyou Hinata, Karasuno's short but incredibly proficient middle blocker.\n" + "\n" + "Karasuno has never been able to beat Nekoma in practice matches. Even so, despite his usual indifference, Kenma feels a tinge of excitement at the prospect of facing Karasuno in a high-stakes official game with no do-overs. To advance to the semifinals and ultimately restore their team's former glory, Karasuno must find a way to overcome Kenma's brilliant strategy and defeat Nekoma in their own territory."),
            Movie(R.drawable.movie_6, "Look Back\n", "58m", "R13+", "Fourth grader Ayumu Fujino regularly draws four-panel manga for her school newspaper and is lauded as having the best artwork in her class. One day, she is asked by her teacher to turn over one of her manga slots in the school newspaper to a truant student named Kyomoto. When Kyomoto's manga pops up alongside Fujino's, it receives high praise for its detailed artwork, making Fujino furiously jealous.\n" + "\n" + "Refusing to be beaten by someone who barely attends school, Fujino devotes herself to learning to create manga. As time goes on though, her goal of outshining Kyomoto seems to only get further and further away; and Fujino, now in sixth grade, eventually gives up and quits making manga.\n" + "\n" + "Graduation day arrives, and Fujino is asked to deliver Kyomoto's graduation certificate to her. Through chance, the two end up coming face to face, and their unexpected meeting will end up having consequences far beyond what either of them could ever predict.")
            )

        // Mengatur RecyclerView
        recyclerView.adapter = MovieAdapter(requireContext(), movieList)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
